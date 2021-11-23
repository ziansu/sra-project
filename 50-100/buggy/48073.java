public org.domeos.basemodel.HttpResponseTemp<?> downloadLogFile(int imageId, long userId) {
    if (userId <= 0) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapResultStat(ResultStat.FORBIDDEN);
    }
    java.lang.String md5 = imageBiz.getBaseImageLogMD5(imageId);
    if (org.apache.commons.lang3.StringUtils.isBlank(md5)) {
        return ResultStat.OK.wrap(null);
    }
    byte[] content = fileContentBiz.getContentByMd5(md5);
    if (content == null) {
        return ResultStat.OK.wrap(null);
    }
    return ResultStat.OK.wrap(new java.lang.String(content));
}