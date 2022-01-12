public void doFragmentReplacement(android.support.v4.app.FragmentManager fragmentManager, android.support.v4.app.Fragment fragment, java.lang.Class fragmentClass) {
    try {
        fragment = ((android.support.v4.app.Fragment) (fragmentClass.newInstance()));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    fragmentManager.beginTransaction().replace(R.id.smartLockLayout, fragment).addToBackStack(null).commit();
}