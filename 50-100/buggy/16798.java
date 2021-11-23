private void setMenuVisibility(android.view.View cont, boolean visible) {
    android.widget.FrameLayout layout = ((android.widget.FrameLayout) (cont));
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    int hidingId = layout.getId();
    android.support.v4.app.Fragment frag = fm.findFragmentById(hidingId);
    if (null != frag) {
        frag.setMenuVisibility(visible);
    }
}