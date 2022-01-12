@com.mpp.controller.RequestMapping(method = RequestMethod.POST, value = "/labDelete", produces = "application/json; charset=utf-8")
@com.mpp.controller.ResponseBody
public com.mpp.constants.CodeMessage labDelete(@com.mpp.controller.RequestParam
java.lang.Integer id) {
    labService.deleteLab(id);
    return com.mpp.constants.JsonReturn.getSuccess("success");
}