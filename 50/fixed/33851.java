public static void addToBalance(java.math.BigDecimal a) {
    com.admalamalinchock.thedudleycolony.game.Game.Balance = com.admalamalinchock.thedudleycolony.game.Game.Balance.add(a);
    de.greenrobot.event.EventBus.getDefault().post(new com.admalamalinchock.thedudleycolony.game.BalanceEvent(("$" + (com.admalamalinchock.thedudleycolony.game.Game.Balance.toString()))));
}