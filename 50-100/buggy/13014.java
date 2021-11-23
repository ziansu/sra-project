public static java.lang.String getTodaysTshirt() {
    if ((com.coollooks.Util.tShirtPathList) == null)
        com.coollooks.Util.setTshirtList();
    
    int i = ((int) (((java.lang.Math.random()) * 33) % ((com.coollooks.Util.tShirtPathList.size()) - 1)));
    if ((com.coollooks.Util.tShirtPathList.size()) > 0)
        return com.coollooks.Util.tShirtPathList.get(i);
    else
        return null;
    
}