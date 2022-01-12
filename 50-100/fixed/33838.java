@org.springframework.web.bind.annotation.RequestMapping(value = "/getFeedbackVipName", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.cidic.sdx.hpgl.model.ResultModel getFeedbackVipName(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam
int userId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String matchlistIds) {
    com.cidic.sdx.util.WebRequestUtil.AccrossAreaRequestSet(request, response);
    resultModel = new com.cidic.sdx.hpgl.model.ResultModel();
    java.lang.System.out.println(matchlistIds);
    java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> feedBackMap = feedbackServiceImpl.getFeedbackVipName(userId, matchlistIds);
    resultModel.setResultCode(200);
    resultModel.setSuccess(true);
    resultModel.setObject(feedBackMap);
    return resultModel;
}