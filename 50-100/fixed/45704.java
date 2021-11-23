@org.apache.shiro.authz.annotation.RequiresRoles(value = { "竞赛者" })
@org.springframework.web.bind.annotation.RequestMapping(value = "/uploadWork/{id}")
public org.springframework.web.servlet.ModelAndView uploadWork(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable
int id) throws com.cidic.design.exception.ServerException {
    com.cidic.design.model.Production production = null;
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    if (com.cidic.design.util.DateUtil.compareDate(configInfo.contribute_end_time)) {
        if (id > 0) {
            production = productionServiceImpl.getProductionDetailById(id).get();
        }
        model.setViewName("/frontend/uploadWork");
        model.addObject(production);
    }else {
        throw new com.cidic.design.exception.ServerException(400, "投稿已经结束");
    }
    return model;
}