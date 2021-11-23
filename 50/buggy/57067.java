@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "", method = RequestMethod.PUT)
public org.domeos.basemodel.HttpResponseTemp<?> modifyBaseImageCustom(@org.domeos.framework.api.controller.image.RequestBody
org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    long userId = org.domeos.framework.engine.AuthUtil.getUserId();
    java.lang.String username = org.domeos.framework.engine.AuthUtil.getCurrentUserName();
    return baseImageCustomService.modifyBaseImageCustom(userId, username, baseImageCustom);
}