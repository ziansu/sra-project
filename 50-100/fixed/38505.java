public static java.lang.String getDescription(org.jsoup.nodes.Document doc) {
    java.lang.String description = "";
    org.jsoup.select.Elements sections = doc.select("p");
    description = sections.get(1).toString();
    description = org.jsoup.Jsoup.clean(description, org.jsoup.safety.Whitelist.simpleText());
    description = description.replaceAll("<\\/?[bi]>", "");
    return description;
}