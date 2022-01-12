public void actionPerformed(java.awt.event.ActionEvent e) {
    if (game.changeState(FFStateType.FAST_MONEY)) {
        bwyap.utility.logging.Logger.info("Playing fast money!");
        fastmoney.setEnabled(false);
        window.setQuestionSelectionEnabled(false);
        window.setQuestionControlEnabled(false);
        if (!(game.finished()))
            play.setEnabled(true);
        
        endGame.setEnabled(true);
        if (!(window.playingFastMoney()))
            window.playFastMoney();
        
    }
}