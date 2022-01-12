static java.lang.String getAuthor(org.jsoup.nodes.Element bdItem) {
    java.util.Map<java.lang.String, java.lang.String> authorAndScriptWriter = service.FnacExtractData.getAuthorScriptWriter(bdItem);
    return authorAndScriptWriter.get("author");
}