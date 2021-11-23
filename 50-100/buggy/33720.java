public static void setResources(android.app.Activity activity, android.content.res.Resources resources) {
    java.lang.Object target = activity;
    java.lang.Class targetClass = android.view.ContextThemeWrapper.class;
    if ((Build.VERSION.SDK_INT) <= 16) {
        target = activity.getBaseContext();
        targetClass = target.getClass();
    }
    if ((net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field) == null) {
        net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field = net.wequick.small.util.ReflectAccelerator.getDeclaredField(targetClass, "mResources");
        if ((net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field) == null)
            return ;
        
    }
    net.wequick.small.util.ReflectAccelerator.setValue(net.wequick.small.util.ReflectAccelerator.sContextThemeWrapper_mResources_field, target, resources);
}