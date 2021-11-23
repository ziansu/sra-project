public static void switchSignToInitialState(org.bukkit.block.Sign sign, me.wirlie.allbanks.Banks.BankType btype) {
    if ((!(sign.getBlock().getType().equals(Material.SIGN))) && (!(sign.getBlock().getType().equals(Material.WALL_SIGN))))
        return ;
    
    me.wirlie.allbanks.Banks.switchSignToStep(btype, sign, (-1));
}