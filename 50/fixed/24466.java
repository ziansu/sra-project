private void activateView(android.view.View parent) {
    for (android.view.View foo : parent.getTouchables()) {
        foo.setClickable(true);
        foo.setEnabled(true);
    }
    parent.setEnabled(true);
    parent.setClickable(true);
}