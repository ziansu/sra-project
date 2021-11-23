private void activateView(android.view.View parent) {
    for (android.view.View foo : spinnerPlayers.getTouchables()) {
        foo.setClickable(true);
        foo.setEnabled(true);
    }
    parent.setEnabled(true);
}