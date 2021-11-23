public static void makeRefund(net.minecraft.entity.player.EntityPlayer player, int amount) {
    if (amount == 0)
        return ;
    
    mytown.commands.Resident res = mytown.proxies.DatasourceProxy.getDatasource().getOrMakeResident(player);
    mytown.proxies.EconomyProxy.getEconomy().giveMoneyToPlayer(player, amount);
    res.sendMessage(mytown.commands.Commands.getLocal().getLocalization("mytown.notification.refund", amount, mytown.proxies.EconomyProxy.getEconomy().getCurrency(amount)));
}