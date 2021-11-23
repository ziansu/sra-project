@org.springframework.web.bind.annotation.RequestMapping(value = "leanringTimeList", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getLearningTimeList(java.util.Date beginTime, java.util.Date endTime) {
    com.era.common.model.User user = com.era.education.util.Client.getUser();
    java.lang.Integer userId = user.getId();
    java.util.List<com.era.education.controller.LearningTime> learningTimeList = learningService.getLearningTimeList(userId, beginTime, endTime);
    return com.era.common.util.Response.success(learningTimeList);
}