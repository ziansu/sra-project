private void createScreen(com.bytezone.dm3270.display.CharacterSize characterSize) {
    screenPositions = new com.bytezone.dm3270.display.ScreenPosition[screenSize];
    com.bytezone.dm3270.display.ScreenContext base = pen.getBase();
    for (int i = 0; i < (screenSize); i++)
        screenPositions[i] = new com.bytezone.dm3270.display.ScreenPosition(i, gc, characterSize, base);
    
    for (com.bytezone.dm3270.orders.Order order : command)
        order.process(this);
    
}