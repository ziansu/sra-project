@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "", method = RequestMethod.POST)
public org.domeos.basemodel.HttpResponseTemp<?> setBaseImageCustom(@org.domeos.framework.api.controller.image.RequestBody
org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    return baseImageCustomService.addBaseImageCustom(baseImageCustom);
}