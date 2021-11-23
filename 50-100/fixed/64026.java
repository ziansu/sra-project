@java.lang.Override
public void replaceFragment(android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.setCustomAnimations(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
    transaction.replace(R.id.container, fragment);
    if (addToBackStack)
        transaction.addToBackStack("backstack");
    
    transaction.commit();
}