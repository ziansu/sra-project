@java.lang.Override
public void addPlayer(java.lang.String playerName, int balance, int playerID) {
    java.awt.Color[] colors = new java.awt.Color[]{ java.awt.Color.BLUE , java.awt.Color.WHITE , java.awt.Color.MAGENTA , java.awt.Color.YELLOW , java.awt.Color.BLACK , java.awt.Color.GREEN };
    desktop_codebehind.Car car = new desktop_codebehind.Car.Builder().primaryColor(colors[(playerID - 1)]).secondaryColor(colors[(5 - (playerID - 1))]).build();
    desktop_resources.GUI.addPlayer(playerName, balance, car);
    desktop_resources.GUI.setCar(1, playerName);
}