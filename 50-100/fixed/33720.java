public static void setResources(android.app.Activity activity, android.content.res.Resources resources) {
    if ((net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field) == null) {
        net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field = net.wequick.small.util.ReflectAccelerator.getDeclaredField(android.view.ContextThemeWrapper.class, "mResources");
    }
    if ((net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field) == null)
        return ;
    
    net.wequick.small.util.ReflectAccelerator.setValue(net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field, activity, resources);
}