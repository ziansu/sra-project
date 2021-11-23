public boolean checkSite(int n) {
    for (int i = 0; i < (siteList.size());) {
        if ((siteList.get(i).getSiteNumber()) == n)
            return false;
        
    }
    return true;
}