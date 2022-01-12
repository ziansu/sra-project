public boolean onBackPressed() {
    if ((mReactInstanceManager) != null) {
        mReactInstanceManager.onBackPressed();
        return true;
    }else {
        return super.onBackPressed();
    }
}