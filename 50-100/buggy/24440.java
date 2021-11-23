public void setBot(int player, int difficulty) {
    botPlaying = true;
    botMove = new int[2];
    botMoved = false;
    botPlayerDesignation = java.lang.Math.abs((player % 2));
    bot = new client.views.offline.randBot();
    if ((botPlayerDesignation) == 1) {
        botMoved = true;
        botPlayerDesignationBOOL = true;
        myTurn(true);
    }else {
        this.verifyMove();
        botPlayerDesignationBOOL = false;
        myTurn(false);
    }
}