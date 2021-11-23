private boolean isPlugCommandAvailable(boolean plug) {
    return ((((getSelectedItems()) != null) && ((getSelectedItems().size()) > 0)) && (isPlugAvailableByDisks(plug))) && ((isVmDown()) || (isHotPlugAvailable()));
}