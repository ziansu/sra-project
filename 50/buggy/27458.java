public org.jsoup.select.Elements parse(org.jsoup.select.Elements r) {
    results = r.select("div.stp--new-product-tile-container.desktop");
    java.lang.System.out.println(((results.size()) + " Results have been returned from Staples."));
    return results;
}