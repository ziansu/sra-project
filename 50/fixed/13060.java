@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/preview/{docMD5}", method = RequestMethod.GET)
public org.domeos.basemodel.HttpResponseTemp<?> previewFile(@org.domeos.framework.api.controller.image.PathVariable
java.lang.String docMD5, @org.domeos.framework.api.controller.image.RequestBody
org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    return baseImageCustomService.previewFile(baseImageCustom, docMD5);
}