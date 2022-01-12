public org.domeos.basemodel.HttpResponseTemp<?> deleteBaseImageCustom(long userId, int imageId) {
    if (userId <= 0) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapResultStat(ResultStat.FORBIDDEN);
    }
    org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom = imageBiz.getBaseImageCustomById(imageId);
    if (baseImageCustom == null) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapMessage(ResultStat.PARAM_ERROR, "base image custom info is null");
    }
    imageBiz.deleteBaseImageCustomById(baseImageCustom.getId());
    return ResultStat.OK.wrap(null, null);
}