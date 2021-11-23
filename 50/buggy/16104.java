public tankbattle.client.stub.GameState.Tank[] getFriendlyTanks() {
    for (tankbattle.client.stub.GameState.Player p : players) {
        java.lang.System.out.println(p.name);
        if (p.name.equals("BeigeCardigan")) {
            return p.tanks;
        }
    }
    return new tankbattle.client.stub.GameState.Tank[0];
}