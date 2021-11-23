public void setOpponentDi(java.util.ArrayList<client.Würfel> würfel) {
    sl.getLogger().info("Opponents Die are being set");
    int x = 0;
    for (x = 0; x < (view.WürfelPL2.size()); x++) {
        view.WürfelPL2.get(x).setAktAugenzahl(würfel.get(x).getAktAugenzahl());
    }
    sl.getLogger().info("Opponent Die changed");
}