@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/getListProductionByPage", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.cidic.design.model.ResultModel getListProductionByPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam
int offset, @org.springframework.web.bind.annotation.RequestParam
int limit, @org.springframework.web.bind.annotation.RequestParam(required = false)
int groupId) {
    resultModel = new com.cidic.design.model.ResultModel();
    try {
        com.cidic.design.model.ProdutionPageModel produtionPageModel = productionServiceImpl.getListOnlyProductionInfoByPage(offset, limit, groupId);
        resultModel.setResultCode(200);
        resultModel.setObject(produtionPageModel);
        resultModel.setSuccess(true);
        return resultModel;
    } catch (java.lang.Exception e) {
        throw new com.cidic.design.exception.DCException(500, "获取数据出错");
    }
}