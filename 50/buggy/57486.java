@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/validate", method = RequestMethod.POST)
public org.domeos.basemodel.HttpResponseTemp<?> validation(@org.domeos.framework.api.controller.image.RequestParam
java.lang.String imageName, @org.domeos.framework.api.controller.image.RequestParam
java.lang.String imageTag) {
    long userId = org.domeos.framework.engine.AuthUtil.getUserId();
    return baseImageCustomService.validation(userId, imageName, imageTag);
}