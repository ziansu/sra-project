private com.java.laiy.model.Player getCurrentPlayer(final com.java.laiy.model.Player firstPlayer) {
    int firstPlayerNum = getFirstPlayerNum(firstPlayer);
    int[] playersTurns = getPlayersTurns();
    if ((playersTurns[com.java.laiy.controller.GameController.FIRST_PLAYER]) == (playersTurns[com.java.laiy.controller.GameController.SECOND_PLAYER])) {
        return players[firstPlayerNum];
    }else {
        if (firstPlayerNum == (com.java.laiy.controller.GameController.FIRST_PLAYER)) {
            return players[com.java.laiy.controller.GameController.SECOND_PLAYER];
        }else {
            return players[com.java.laiy.controller.GameController.FIRST_PLAYER];
        }
    }
}