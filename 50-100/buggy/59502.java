@java.lang.Override
public org.domeos.basemodel.HttpResponseTemp<?> previewFile(long userId, org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom, java.lang.String docMD5) {
    if (baseImageCustom == null) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapMessage(ResultStat.PARAM_ERROR, "cannot find the custom base image");
    }
    if (userId <= 0) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapResultStat(ResultStat.FORBIDDEN);
    }
    byte[] content = fileContentBiz.getContentByMd5(docMD5);
    if (content == null) {
        return ResultStat.OK.wrap(null);
    }
    return ResultStat.OK.wrap(new java.lang.String(content));
}