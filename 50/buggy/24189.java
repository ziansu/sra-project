public com.pihen.d3restapi.beans.XP getXPByLevel(int level) {
    if (level < 1)
        return new com.pihen.d3restapi.beans.XP(0, 0, 0);
    
    if (level > 1000) {
        return lvlList.get(1000);
    }
    return lvlList.get(level);
}