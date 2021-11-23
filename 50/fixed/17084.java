private static int getMethodType(java.lang.String method) {
    if (method.startsWith("GET_")) {
        return com.lody.virtual.client.hook.providers.SettingsProviderHook.METHOD_GET;
    }
    if (method.startsWith("PUT_")) {
        return com.lody.virtual.client.hook.providers.SettingsProviderHook.METHOD_PUT;
    }
    return -1;
}