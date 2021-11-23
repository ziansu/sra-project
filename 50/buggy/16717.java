static java.lang.String getAuthor(org.jsoup.nodes.Element bdItem) {
    java.util.Map<java.lang.String, java.lang.String> authorAndScriptWriter = service.FnacExtractData.getAuthorScriptWriter(bdItem);
    play.Logger.debug("FnacExtractData : getAuthor");
    return authorAndScriptWriter.get("author");
}