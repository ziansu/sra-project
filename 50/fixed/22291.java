@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/build/{imageId}", method = RequestMethod.POST)
public org.domeos.basemodel.HttpResponseTemp<?> startBuild(@org.domeos.framework.api.controller.image.PathVariable
int imageId) {
    return baseImageCustomService.startBuild(imageId);
}