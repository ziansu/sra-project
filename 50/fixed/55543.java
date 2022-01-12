private void onSwipingStart() {
    if (!(swipeMode)) {
        viewBackup = null;
        swipeMode = true;
        if ((onStart) != null) {
            onStart.onChange();
        }
    }
}