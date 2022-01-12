@java.lang.Override
public void fragmentPlaqueDismiss() {
    this.instantiableViewControllerRequestsDismissal(plaqueViewFragment.mInstance);
    android.util.Log.d(((edu.uoregon.casls.aris_android.Utilities.AppConfig.LOGTAG) + (edu.uoregon.casls.aris_android.Utilities.AppConfig.LOGTAG_D1)), ((getClass().getSimpleName()) + " fragmentPlaqueDismiss(). looking at plaqueViewFragment.tab: "));
    if ((plaqueViewFragment) != null) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.popBackStack();
        this.hideNavBar();
    }
}