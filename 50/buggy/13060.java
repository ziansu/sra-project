@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/preview/{docMD5}", method = RequestMethod.GET)
public org.domeos.basemodel.HttpResponseTemp<?> previewFile(@org.domeos.framework.api.controller.image.PathVariable
java.lang.String docMD5, @org.domeos.framework.api.controller.image.RequestBody
org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    long userId = org.domeos.framework.engine.AuthUtil.getUserId();
    return baseImageCustomService.previewFile(userId, baseImageCustom, docMD5);
}