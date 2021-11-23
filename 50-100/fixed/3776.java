private static boolean isAccepted(java.lang.String oreDic) {
    if ((oreDic.length()) < 3)
        return false;
    
    java.lang.String title = oreDic.substring(0, 3);
    java.util.List<java.lang.String> banList = tinker_io.handler.OreCrusherBanList.getBanList();
    if ((title.equals("ore")) && (!(banList.contains(oreDic)))) {
        return true;
    }
    return false;
}