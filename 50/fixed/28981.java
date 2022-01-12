public static void startHookFragment(android.app.Activity activity, android.content.Intent rawIntent, com.jude.ferryman.internal.router.result.OnActivityResultListener listener) {
    com.jude.ferryman.internal.router.result.HookFragment fragment = com.jude.ferryman.internal.router.result.ActivityResultHooker.getValidFragment(((android.support.v4.app.FragmentActivity) (activity)));
    fragment.startActivityForResult(rawIntent, listener);
}