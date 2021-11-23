@java.lang.Override
public void run() {
    controller.ComputerAI.winMoves = helper.Rule.getWinMoves();
    while ((this.cntr.gameStatus) == 0) {
        if ((this.cntr.turn) == (this.player.turn)) {
            this.makeMove();
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception ex) {
            java.lang.System.out.println(ex.toString());
        }
    } 
    java.lang.System.out.print("AI Thread exiting ...\n>>>");
    java.lang.String test = new java.util.Scanner(java.lang.System.in).next();
}