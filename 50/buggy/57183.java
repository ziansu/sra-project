@com.wordnik.swagger.annotations.ApiOperation(value = "参加活动", httpMethod = "POST", response = com.cangqu.gallery.base.vo.BaseResultVo.class, notes = "普通用户参加活动")
@com.cangqu.gallery.core.controller.RequestMapping(value = "/join", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
@com.cangqu.gallery.core.controller.ResponseBody
public com.cangqu.gallery.base.vo.BaseResultVo joinActivity(@com.cangqu.gallery.core.controller.RequestParam
@com.wordnik.swagger.annotations.ApiParam(value = "活动ID")
java.lang.String activityId, @com.cangqu.gallery.core.controller.RequestParam
@com.wordnik.swagger.annotations.ApiParam(value = "参加活动的用户ID")
java.lang.String userId) {
    try {
        activityService.joinActivity(activityId, userId);
    } catch (com.cangqu.gallery.base.Exception.BaseException e) {
        return buildFailedResultInfo(e);
    }
    return buildSuccessResultInfo("参加活动成功！");
}