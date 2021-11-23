public void setTradeCancelled(com.universeprojects.cacheddatastore.CachedDatastoreService ds, com.universeprojects.cacheddatastore.CachedEntity character) throws com.universeprojects.miniup.server.commands.framework.UserErrorMessage {
    if (ds == null)
        ds = getDB();
    
    com.universeprojects.miniup.server.TradeObject tradeObject = com.universeprojects.miniup.server.TradeObject.getTradeObjectFor(ds, character);
    if ((tradeObject == null) || (tradeObject.isCancelled()))
        throw new com.universeprojects.miniup.server.commands.framework.UserErrorMessage("Trade has been cancelled.");
    
    tradeObject.flagCancelled(ds, character);
    sendNotification(ds, tradeObject.getOtherCharacter(character.getKey()), NotificationType.fullpageRefresh);
}