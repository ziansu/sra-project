@java.lang.Override
public boolean execute(com.intellij.openapi.compiler.CompileContext context) {
    for (com.intellij.openapi.module.Module module : com.intellij.openapi.module.ModuleManager.getInstance(context.getProject()).getModules()) {
        com.google.cloud.tools.intellij.jps.model.impl.StackdriverProperties configuration = com.intellij.facet.FacetManager.getInstance(module).getFacetByType(com.google.cloud.tools.intellij.stackdriver.facet.StackdriverFacetType.ID).getConfiguration().getState();
        configuration.setCloudSdkPath(com.google.cloud.tools.intellij.appengine.sdk.CloudSdkService.getInstance().getSdkHomePath());
    }
    return true;
}