public boolean insertURL(java.lang.String url) {
    java.lang.String[] element = new java.lang.String[]{ url , "0" };
    if (Utils.connectToUrl(url)) {
        SharedUrlPool.offer(element);
        return true;
    }else {
        return false;
    }
}