public static void setEconomyBar(float economyBar_) {
    if (((com.gpteam.shopmanager.Economy.Economy.economyBar) >= (com.gpteam.shopmanager.Economy.Economy.MIN_ECONOMY_BAR_VALUE)) && ((com.gpteam.shopmanager.Economy.Economy.economyBar) <= (com.gpteam.shopmanager.Economy.Economy.MAX_ECONOMY_BAR_VALUE)))
        com.gpteam.shopmanager.Economy.Economy.economyBar = economyBar_;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("msg");
    
}