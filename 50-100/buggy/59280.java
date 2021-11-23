private void replaceFragment(@android.support.annotation.IdRes
int containerViewId, android.support.v4.app.Fragment fragment, java.lang.String addToBackStack, boolean forward) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    if (forward) {
        ft.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right, R.anim.slide_from_right, R.anim.slide_to_left);
    }else {
        ft.setCustomAnimations(R.anim.slide_from_right, R.anim.slide_to_left, R.anim.slide_from_left, R.anim.slide_to_right);
    }
    ft.replace(containerViewId, fragment);
    if (!(android.text.TextUtils.isEmpty(addToBackStack))) {
        ft.addToBackStack(null);
    }
    ft.commit();
}