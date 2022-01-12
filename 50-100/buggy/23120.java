public java.lang.Integer checkTerminalState(net.etfbl.connectfour.Move previousMove, net.etfbl.connectfour.Game.Player previousPlayer) {
    java.lang.System.out.println(("TERM check: " + (previousMove.getRow())));
    if (checkFour(previousMove.getRow(), previousMove.getColumn(), previousPlayer.ordinal())) {
        return previousPlayer == (net.etfbl.connectfour.Game.Player.RED) ? net.etfbl.connectfour.GameBoard.RED_WON : net.etfbl.connectfour.GameBoard.YELLOW_WON;
    }else
        if (checkDraw(previousMove.getRow(), previousMove.getColumn(), previousPlayer.ordinal())) {
            return net.etfbl.connectfour.GameBoard.DRAW;
        }
    
    return null;
}