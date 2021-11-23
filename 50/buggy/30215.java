@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
public org.domeos.basemodel.HttpResponseTemp<?> deleteBaseImageCustomById(@org.domeos.framework.api.controller.image.PathVariable
int id) {
    long userId = org.domeos.framework.engine.AuthUtil.getUserId();
    return baseImageCustomService.deleteBaseImageCustom(userId, id);
}