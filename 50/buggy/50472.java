public void betMoney(int money) {
    if ((com.bai.chesscard.utils.ConstentNew.GAMER_TABLE_MONEY) < money) {
        gameOprateView.toastMsg("金币不足");
        return ;
    }
    com.bai.chesscard.async.GameOprateData.getInstance(this).betMoney(money);
}