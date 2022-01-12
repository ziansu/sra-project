private java.lang.Float parseDistance(java.lang.String distStr) {
    if ((distStr.length()) > 0) {
        distStr = distStr.substring(0, ((distStr.length()) - 3)).replaceAll(",", ".");
    }else
        return java.lang.Float.valueOf(0);
    
    return java.lang.Float.valueOf(distStr);
}