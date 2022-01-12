private java.lang.String getGameListName(int n) {
    final int basicListNo = getBasicListNo();
    final int alterListNo = getAlterListNo();
    if (n == basicListNo) {
        return getGameListFileName();
    }else
        if (n == alterListNo) {
            return getGameListAltFileName();
        }else {
            return com.nlbhub.instead.standalone.Globals.GameListFileName;
        }
    
}