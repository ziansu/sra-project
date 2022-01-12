public final void setMyLocationEnabled(boolean enabled) {
    mIsMyLocationEnabled = enabled;
    toggleGps(enabled);
}