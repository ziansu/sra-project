private void updateApplication() {
    if ((listener) != null) {
        listener.setLocation(location);
        listener.setFlagsNearby(flagsNearby);
        listener.setHiddenFlags(hiddenFlags);
        listener.setMyFlags(myFlags);
        listener.setBagFlags(bagFlags);
    }
}