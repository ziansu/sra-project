public java.lang.String getRewardType(java.lang.String reward) {
    java.lang.String str = getData(reward).getString("RewardType");
    if (str != null) {
        if (str.equalsIgnoreCase("online")) {
            return "ONLINE";
        }else
            if (str.equalsIgnoreCase("offline")) {
                return "OFFLINE";
            }else {
                return "BOTH";
            }
        
    }
    return "BOTH";
}