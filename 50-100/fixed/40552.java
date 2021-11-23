public void refreshGoForward(boolean isActivate) {
    if (isActivate) {
        findViewById(R.id.go_forward).setActivated(true);
        findViewById(R.id.go_forward).setEnabled(true);
    }else {
        findViewById(R.id.go_forward).setActivated(false);
        if (manager.getCurrentTabGroup().canGoForward()) {
            findViewById(R.id.go_forward).setEnabled(true);
        }else {
            findViewById(R.id.go_forward).setEnabled(false);
        }
    }
}