static java.lang.String getCollection(org.jsoup.nodes.Element bdItem) {
    java.lang.String collection = "No information";
    collection = service.FnacExtractData.getTitle(bdItem);
    if (collection.contains("Tome")) {
        collection = collection.split("Tome")[0];
    }
    play.Logger.debug((("FnacExtractData : getCollection :_____MCA___________________________ :" + "collection : ") + collection));
    return collection.replaceAll(" - ", "").trim();
}