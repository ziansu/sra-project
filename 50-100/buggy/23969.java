private boolean contains(java.lang.String url, java.util.Vector<java.lang.String> urls, int atRank) {
    for (int i = 0; (i < (urls.size())) && (i < atRank); i++) {
        java.lang.System.out.println(urls.get(i));
        if (url.equals(urls.get(i)))
            return true;
        
    }
    return false;
}