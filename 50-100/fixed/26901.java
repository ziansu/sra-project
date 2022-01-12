@java.lang.Override
public org.domeos.basemodel.HttpResponseTemp<?> modifyBaseImageCustom(org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    if (baseImageCustom == null) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapMessage(ResultStat.PARAM_ERROR, "base image custom info is null");
    }
    if (!(org.apache.commons.lang3.StringUtils.isBlank(baseImageCustom.checkLegality()))) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapMessage(ResultStat.PARAM_ERROR, baseImageCustom.checkLegality());
    }
    return addBaseImageCustom(baseImageCustom);
}