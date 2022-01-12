@pw.ohayou.core.controller.RequestMapping(value = "submitData", method = RequestMethod.POST)
@pw.ohayou.core.controller.ResponseBody
public pw.ohayou.core.util.JsonResult submitData(@pw.ohayou.core.controller.RequestBody
pw.ohayou.common.dtos.RoshamboDTO roshamboDTO) {
    pw.ohayou.common.model.TempDO tempDO = roshamboAO.getRoshamboByUsername(roshamboDTO.getUsername());
    pw.ohayou.common.model.TempDO newTempDO = pw.ohayou.core.util.RoshamboUtil.convertDTOToVO(roshamboDTO, tempDO);
    if (tempDO == null)
        tempManager.insertSelective(newTempDO);
    else
        tempManager.updateByPrimaryKeySelective(newTempDO);
    
    pw.ohayou.core.util.JsonResult jsonResult = new pw.ohayou.core.util.JsonResult();
    return jsonResult;
}