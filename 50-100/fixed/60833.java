public static boolean addDays(java.lang.String playerName, int days) {
    int remains = cc.isotopestudio.ISOcentVIP.data.PlayerData.getRemainDays(playerName);
    cc.isotopestudio.ISOcentVIP.data.PlayerData.setRemainDays(playerName, (remains + days));
    if ((remains + days) >= 365) {
        cc.isotopestudio.ISOcentVIP.data.PlayerData.setVIPType(playerName, VIPType.yVIP);
        if (days >= 365) {
            cc.isotopestudio.ISOcentVIP.data.PlayerData.addPoints(playerName, ((Settings.yVIPGift) * (days / 365)));
            return true;
        }
    }else
        cc.isotopestudio.ISOcentVIP.data.PlayerData.setVIPType(playerName, VIPType.mVIP);
    
    return false;
}