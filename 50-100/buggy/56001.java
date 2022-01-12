@org.springframework.web.bind.annotation.RequestMapping(value = "/getData", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.cidic.sdx.model.ResultModel getDate(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam
int pageNum, @org.springframework.web.bind.annotation.RequestParam
int limit) {
    com.cidic.sdx.util.WebRequestUtil.AccrossAreaRequestSet(request, response);
    try {
        java.util.List<com.cidic.sdx.model.HPModel> resultData = hpManageServiceImpl.getHpData(pageNum, limit);
        resultModel.setResultCode(200);
        resultModel.setSuccess(true);
        resultModel.setObject(resultData);
    } catch (java.lang.Exception e) {
        throw new com.cidic.sdx.exception.SdxException(500, "获取数据失败");
    }
    return resultModel;
}