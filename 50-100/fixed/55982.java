public static void cancelLoading(android.support.v4.app.FragmentActivity activity) {
    try {
        android.support.v4.app.DialogFragment loadingFragment = ((android.support.v4.app.DialogFragment) (activity.getSupportFragmentManager().findFragmentByTag(com.liangmayong.loading.Loading.TAG)));
        if (loadingFragment != null) {
            activity.getSupportFragmentManager().beginTransaction().remove(loadingFragment).commit();
        }
    } catch (java.lang.Exception e) {
    }
}