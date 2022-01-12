private static java.lang.String nameSetter(int playerId) {
    java.lang.System.out.println(("Please Enter a Name for Player " + playerId));
    java.util.Scanner nameScanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String playerOrder = nameScanner.nextLine();
    if (playerOrder.equals("")) {
        return GameStart.nameSetter(playerId);
    }
    if (((GameStart.firstPlayerName) != null) && (GameStart.firstPlayerName.equals(playerOrder))) {
        java.lang.System.out.println("Invalid Name, cannot have the same name as First Player!");
        return GameStart.nameSetter(playerId);
    }
    return playerOrder;
}