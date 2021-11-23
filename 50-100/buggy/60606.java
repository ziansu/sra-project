public java.util.List<java.lang.String> getDocumentTitles() {
    java.util.List<java.lang.String> titles = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String author : datamap.keySet()) {
        for (java.lang.String doctitle : datamap.get(author).keySet()) {
            java.lang.System.out.println(((("Adding document title " + doctitle) + " by ") + author));
            titles.add(doctitle);
        }
    }
    return titles;
}