protected void setStatusBarTint(int primaryDarkColor) {
    com.readystatesoftware.systembartint.SystemBarTintManager tintManager = new com.readystatesoftware.systembartint.SystemBarTintManager(this);
    tintManager.setStatusBarTintEnabled(true);
    tintManager.setStatusBarTintColor(primaryDarkColor);
}