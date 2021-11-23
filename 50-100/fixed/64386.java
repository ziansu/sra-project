@org.jetbrains.annotations.NotNull
public static ro.redeul.google.go.lang.stubs.GoNamesCache getInstance(com.intellij.openapi.project.Project project) {
    if ((ro.redeul.google.go.lang.stubs.GoNamesCache.sdkData) == null) {
        com.intellij.openapi.projectRoots.Sdk sdk = ro.redeul.google.go.sdk.GoSdkUtil.getGoogleGoSdkForProject(project);
        if (sdk != null) {
            ro.redeul.google.go.lang.stubs.GoNamesCache.sdkData = ((ro.redeul.google.go.config.sdk.GoSdkData) (sdk.getSdkAdditionalData()));
        }
    }
    return new ro.redeul.google.go.lang.stubs.GoNamesCache(project);
}