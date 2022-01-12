@java.lang.Override
protected void onRestart() {
    android.app.Fragment frag = getFragmentManager().findFragmentByTag("services");
    if (frag != null) {
        getFragmentManager().beginTransaction().remove(frag).commit();
    }
}