private boolean isSignRankSign(org.bukkit.block.Sign sign) {
    if (sign.getLine(SIGNLINES.TITLE).equalsIgnoreCase(((US.bittiez.SignRanks.main.titlePrefix) + (signTitle))))
        if (!(sign.getLine(SIGNLINES.GROUP).isEmpty()))
            if (sign.getLine(SIGNLINES.ID).startsWith(((org.bukkit.ChatColor.MAGIC) + "")))
                return true;
            
        
    
    return false;
}