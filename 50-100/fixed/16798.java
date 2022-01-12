private void setMenuVisibility(android.view.View cont, boolean visible) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    int hidingId = cont.getId();
    android.support.v4.app.Fragment frag = fm.findFragmentById(hidingId);
    if (null != frag) {
        frag.setMenuVisibility(visible);
    }
}