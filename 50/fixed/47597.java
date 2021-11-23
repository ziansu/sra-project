public void setEconomyBar(float economyBar) {
    if ((economyBar > 0) && (economyBar <= (com.gpteam.shopmanager.Economy.Economy.MAX_ECONOMY_BAR_VALUE)))
        this.economyBar = economyBar;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("msg");
    
}