@java.lang.Override
public org.domeos.basemodel.HttpResponseTemp<?> listBaseImageCustomInfo() {
    try {
        java.util.List<org.domeos.framework.api.model.image.BaseImageCustom> customList = org.domeos.framework.api.service.project.impl.UpdateBuildStatusInfo.updateBaseImageCustoms(imageBiz.listBaseImageCustom());
        java.util.Collections.sort(customList, new org.domeos.framework.api.model.image.BaseImageCustom.ProjectListInfoComparator());
        return ResultStat.OK.wrap(customList);
    } catch (java.lang.Exception e) {
        throw org.domeos.framework.api.controller.exception.ApiException.wrapUnknownException(e);
    }
}