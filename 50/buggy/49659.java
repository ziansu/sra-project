public void onDismiss(int dismissType) {
    clearProfileCache();
    presenter_.detach();
}