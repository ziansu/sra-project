public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    menuSystem.setMenuItemEnabled(enabled, org.jtrfp.trcl.miss.SatelliteViewFactory.VIEW_MENU_PATH);
}