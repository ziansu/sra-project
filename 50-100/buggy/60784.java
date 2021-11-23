@org.springframework.web.bind.annotation.RequestMapping(value = "/score/{id}/{round}")
public org.springframework.web.servlet.ModelAndView score(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
int id, @org.springframework.web.bind.annotation.PathVariable
int round) {
    try {
        java.util.Optional<com.cidic.design.model.Production> production = productionServiceImpl.getProductionDetailById(id);
        org.springframework.web.servlet.ModelAndView modelView = new org.springframework.web.servlet.ModelAndView();
        modelView.setViewName("frontend/judge/score");
        modelView.addObject(production.get());
        return modelView;
    } catch (java.lang.Exception e) {
        throw new com.cidic.design.exception.ServerException(400, "服务器内部出错了");
    }
}