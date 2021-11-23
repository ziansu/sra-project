@java.lang.Override
public void replaceCurrentFragment(android.app.Fragment newFragment, boolean addToStack) {
    android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.fragmentContainer, newFragment);
    if (addToStack) {
        fragmentTransaction.addToBackStack(null);
    }
    fragmentTransaction.commit();
}