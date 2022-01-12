@java.lang.Override
public org.domeos.basemodel.HttpResponseTemp<?> deleteBaseImageCustom(int imageId) {
    org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom = imageBiz.getBaseImageCustomById(imageId);
    if (baseImageCustom == null) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapMessage(ResultStat.PARAM_ERROR, "base image custom info is null");
    }
    imageBiz.deleteBaseImageCustomById(baseImageCustom.getId());
    return ResultStat.OK.wrap(null, null);
}