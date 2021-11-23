@org.springframework.web.bind.annotation.RequestMapping(value = "/records")
@org.springframework.web.bind.annotation.ResponseBody
public com.zes.squad.gmh.web.common.JsonResult<java.util.List<com.zes.squad.gmh.web.entity.vo.PrintSingleVo>> doPrintConsumeRecords(java.lang.String mobile, java.lang.Long memberId, java.util.Date startTime, java.util.Date endTime) {
    com.zes.squad.gmh.web.helper.LogicHelper.ensureParameterExist(mobile, "手机号为空");
    com.zes.squad.gmh.web.helper.LogicHelper.ensureParameterExist(memberId, "会员标识为空");
    com.zes.squad.gmh.web.helper.LogicHelper.ensureParameterExist(startTime, "开始时间不能为空");
    com.zes.squad.gmh.web.helper.LogicHelper.ensureParameterExist(endTime, "结束时间不能为空");
    return com.zes.squad.gmh.web.common.JsonResult.success(consumeService.listConsumeRecords(mobile, memberId, startTime, endTime));
}