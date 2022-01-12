public void substractmoney56(double amountsubstract, org.bukkit.entity.Player player) {
    if ((iConomyversion) == 5) {
        com.nijikokun.register.payment.Methods.getMethod().getAccount(player.getName()).subtract(amountsubstract);
    }else
        if ((iConomyversion) == 6) {
            me.ibhh.xpShop.Account account = new com.iCo6.system.Accounts().get(player.getName());
            account.getHoldings().subtract(amountsubstract);
        }
    
}