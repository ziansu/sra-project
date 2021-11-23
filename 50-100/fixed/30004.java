public void onSpeechCompletion(java.lang.String text, java.lang.String lang) {
    for (dan200.computercraft.api.peripheral.IComputerAccess computer : computers.keySet())
        if (((eventTicker) == 0) || (!(lastMessage.equals(text)))) {
            computer.queueEvent("speechComplete", new java.lang.Object[]{ text , lang });
            eventSubticker = com.austinv11.peripheralsplusplus.tiles.TileEntitySpeaker.TICKER_INTERVAL;
            (eventTicker)++;
        }
    
}