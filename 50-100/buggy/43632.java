private void replaceFragment(@android.support.annotation.NonNull
final android.app.Fragment fragment, final int parentViewId, final int transition) {
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.setTransition(transition);
    transaction.addToBackStack(de.mrapp.android.preference.activity.PreferenceActivity.FRAGMENT_BACK_STACK);
    transaction.replace(parentViewId, fragment);
    transaction.commit();
}