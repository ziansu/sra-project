@java.lang.Override
public void onClick(android.view.View v) {
    if ((regretNumber) == 3) {
        msgDialog = new com.lsf.reversi.app.widget.MessageDialog(this, "只能后悔最多三次。");
        msgDialog.show();
    }else {
        chessBoard = com.lsf.reversi.app.util.HistoryUtil.regretUtil();
        reversiView.regret(chessBoard);
        (regretNumber)++;
        reversiView.regretUI(chessBoard);
        playerTurn();
    }
}