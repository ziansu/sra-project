@java.lang.Override
public void replaceFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
}