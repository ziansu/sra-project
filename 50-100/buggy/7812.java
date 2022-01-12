@org.jetbrains.annotations.NotNull
public static com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManager getManager() {
    if ((com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManager) == null) {
        com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManager = new com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl();
        com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManagerADAuth = new com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerADAuthDecorator(com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManager);
    }
    if ((com.microsoftopentechnologies.intellij.helpers.azure.rest.AzureRestAPIManagerImpl.getManager().getAuthenticationMode()) == (com.microsoftopentechnologies.intellij.helpers.azure.AzureAuthenticationMode.ActiveDirectory)) {
        return com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManagerADAuth;
    }else {
        return com.microsoftopentechnologies.intellij.helpers.azure.sdk.AzureSDKManagerImpl.apiManager;
    }
}