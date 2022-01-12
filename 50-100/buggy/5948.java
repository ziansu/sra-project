private void alterLinks(java.lang.String pathHtml) {
    for (org.jsoup.nodes.Element link : links) {
        java.lang.String atr = link.attr(Constants.ABS_HREF);
        if (atr != null) {
            java.lang.String path = utils.parsers.Parser.urlToPath(atr, root, ("/" + (utils.Constants.PAGE_NAME)));
            java.lang.String relPath = utils.parsers.Parser.convertToRelativePath(utils.parsers.Parser.getPath(pathHtml), utils.parsers.Parser.getPath(path));
            link.attr(Constants.HREF, (relPath + (utils.Constants.PAGE_NAME)));
        }
    }
}