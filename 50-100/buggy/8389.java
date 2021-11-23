public void setEnable(boolean flag) {
    mIsEnabled = flag;
    if ((getNative()) != 0) {
        org.gearvrf.NativeComponent.setEnabled(getNative(), flag);
    }
    if (flag) {
        onEnable();
    }else {
        onDisable();
    }
}