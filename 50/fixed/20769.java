public void setEnabled(boolean enabled) {
    if ((this.enabled) == enabled)
        return ;
    
    this.enabled = enabled;
    menuSystem.setMenuItemEnabled(enabled, org.jtrfp.trcl.miss.SatelliteViewFactory.VIEW_MENU_PATH);
}