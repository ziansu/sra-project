public static void addRoll(int playerID, int die1, int die2, int point, int sum, int result) {
    craps.model.GameHistory.rollHistory = new java.util.ArrayList<java.lang.Integer>();
    craps.model.GameHistory.rollHistory.add(playerID);
    craps.model.GameHistory.rollHistory.add(die1);
    craps.model.GameHistory.rollHistory.add(die2);
    craps.model.GameHistory.rollHistory.add(sum);
    craps.model.GameHistory.rollHistory.add(point);
    craps.model.GameHistory.rollHistory.add(result);
    craps.model.GameHistory.gameHistory.add(craps.model.GameHistory.rollHistory);
}