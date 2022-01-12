public boolean NapHillAction(ankhmorpork.GameObjects.Player objPlayer) {
    boolean status = false;
    java.lang.Integer playerID = objPlayer.getPlayer_id();
    if (playerID != null) {
        ankhmorpork.Game.Game.PaymentFromBank(playerID, 1);
        java.lang.System.out.print("Action Performed");
        status = true;
    }else {
        java.lang.System.out.println("PlayerId is Null");
        java.lang.System.out.println("Action Failed");
        status = false;
    }
    return status;
}