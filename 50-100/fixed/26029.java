@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.cidic.design.model.ResultModel findNewsByPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam
int offset, @org.springframework.web.bind.annotation.RequestParam
int limit) {
    resultModel = new com.cidic.design.model.ResultModel();
    try {
        java.util.List<com.cidic.design.model.News> list = null;
        resultModel.setResultCode(200);
        return resultModel;
    } catch (java.lang.Exception e) {
        throw new com.cidic.design.exception.DCException(500, "创建出错");
    }
}