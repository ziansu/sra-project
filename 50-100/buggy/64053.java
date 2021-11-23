public static void loop() throws PurpleBot.GameActionException {
    while (true) {
        PurpleBot.Archon.trySubmitBullets();
        PurpleBot.Archon.determineMode();
        if ((PurpleBot.Archon.currentMode) != (PurpleBot.Archon.FLEE))
            PurpleBot.Archon.genGardener();
        else
            java.lang.System.out.println((PurpleBot.Archon.flee() ? "Fleeing!" : "Unable to flee!"));
        
        broadcastLocation();
        PurpleBot.Clock.yield();
    } 
}