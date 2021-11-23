public static java.lang.String getDescription(org.jsoup.nodes.Document doc) {
    java.lang.String description = "";
    org.jsoup.select.Elements sections = doc.select("p");
    for (org.jsoup.nodes.Element section : sections) {
    }
    description = org.jsoup.Jsoup.clean(description, org.jsoup.safety.Whitelist.simpleText());
    description = description.replaceAll("<\\/?[bi]>", "");
    return description;
}