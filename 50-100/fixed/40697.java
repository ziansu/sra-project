public static void startContentFragment(@android.support.annotation.NonNull
android.support.v4.app.FragmentManager fragmentManager, @android.support.annotation.NonNull
ir.asparsa.hobbytaste.ui.fragment.content.BaseContentFragment fragment) {
    try {
        fragmentManager.beginTransaction().setCustomAnimations(R.anim.come, 0, 0, R.anim.back).replace(R.id.content, fragment, fragment.getTagName()).addToBackStack(fragment.getTagName()).commit();
    } catch (java.lang.Exception e) {
        ir.asparsa.android.core.logger.L.e(ir.asparsa.hobbytaste.core.util.NavigationUtil.class.getClass(), "start content problem!", e);
    }
}