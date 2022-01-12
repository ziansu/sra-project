public static void loop() throws PurpleBot.GameActionException {
    while (true) {
        PurpleBot.Archon.trySubmitBullets();
        PurpleBot.Archon.determineMode();
        if ((PurpleBot.Archon.currentMode) != (PurpleBot.Archon.FLEE))
            PurpleBot.Archon.genGardener();
        else
            PurpleBot.Archon.flee();
        
        PurpleBot.Archon.broadcastLocation();
        PurpleBot.Clock.yield();
    } 
}