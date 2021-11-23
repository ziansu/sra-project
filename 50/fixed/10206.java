@com.mpp.controller.RequestMapping(method = RequestMethod.POST, value = "/getModifyLab", produces = "application/json; charset=utf-8")
@com.mpp.controller.ResponseBody
public com.mpp.constants.CodeMessage getModifyLab(@com.mpp.controller.RequestParam
java.lang.Integer id) {
    com.mpp.model.Lab l = labService.getLabByLabId(id);
    return com.mpp.constants.JsonReturn.getSuccess(l);
}