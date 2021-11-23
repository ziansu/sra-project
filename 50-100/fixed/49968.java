@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.support.v4.app.Fragment fragment = ((android.support.v4.app.Fragment) (super.instantiateItem(container, position)));
    fm.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).show(fragment).commit();
    return fragment;
}