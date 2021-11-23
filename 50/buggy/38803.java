@java.lang.Override
public void onClose() {
    android.support.v4.app.Fragment f = getSupportFragmentManager().findFragmentByTag(dialogTag);
    android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
    trans.remove(f).commit();
}