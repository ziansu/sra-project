public void loadPosition(int x, int y) {
    ensureSafeWindowPosition(x, y);
    org.micromanager.internal.utils.DefaultUserProfile profile = org.micromanager.internal.utils.DefaultUserProfile.getInstance();
    setBounds(profile.getInt(this.getClass(), ((prefPrefix_) + (org.micromanager.internal.utils.MMFrame.WINDOW_X)), x), profile.getInt(this.getClass(), ((prefPrefix_) + (org.micromanager.internal.utils.MMFrame.WINDOW_Y)), y), getWidth(), getHeight());
}