private void onVersionsUpdated() {
    if (((linkListener) != null) && (areVersionsSet()))
        linkListener.onVersionsUpdated();
    
    updateControllerModeIfPossible();
}