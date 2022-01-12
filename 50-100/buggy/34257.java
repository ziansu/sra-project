public static java.lang.Object getFragmentManagerImpl(android.support.v4.app.FragmentActivity activity) {
    try {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            java.lang.Object controller = chao.app.ami.hooks.SupportFragmentManagerHook.Activity_FragmentController.get(activity);
            java.lang.Object host = chao.app.ami.hooks.SupportFragmentManagerHook.FragmentController_FragmentHost.get(controller);
            return chao.app.ami.hooks.SupportFragmentManagerHook.mFragmentManagerImpl.get(host);
        }else {
            return chao.app.ami.hooks.SupportFragmentManagerHook.mFragmentManagerImpl.get(activity);
        }
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return null;
}