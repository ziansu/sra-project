public int recoverPg(int recovered, boolean uses) {
    if (recovered == (com.ddns.kauron.dungeonmanager.Player.USE_CURATIVE_EFFORT)) {
        if (uses && ((curativeEfforts) <= 0))
            return com.ddns.kauron.dungeonmanager.Player.NOT_CURED;
        else {
            if (uses && ((pg) < (maxPg)))
                (curativeEfforts)--;
            
            pg += (maxPg) / 4;
        }
    }else {
        pg += recovered;
    }
    setState();
    if ((pg) > (maxPg)) {
        pg = maxPg;
        return com.ddns.kauron.dungeonmanager.Player.MAXED;
    }
    return com.ddns.kauron.dungeonmanager.Player.CURED;
}