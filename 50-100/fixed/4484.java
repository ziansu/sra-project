private static java.lang.String globalImageLinksToLocal(java.lang.String pageContent, java.util.ArrayList<java.lang.String> globalNames, java.lang.String current_path) {
    for (java.lang.String s : globalNames) {
        pageContent = pageContent.replace((("src=\"" + s) + "\""), (((("src=\"" + current_path) + "/files/") + (UrlDownloader.getLastPartOfFileName(s))) + "\""));
        java.lang.System.out.printf("replaced %s to %s\n", s, UrlDownloader.getLastPartOfFileName(s));
    }
    return pageContent;
}