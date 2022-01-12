private void deactivateView(android.view.View parent) {
    for (android.view.View foo : parent.getTouchables()) {
        foo.setClickable(false);
        foo.setEnabled(false);
    }
    parent.setEnabled(false);
    parent.setClickable(false);
}