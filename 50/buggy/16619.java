public void lowerEconomyBar(float amount) {
    if ((amount < 0) && (amount <= (economyBar)))
        economyBar -= amount;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("msg");
    
}