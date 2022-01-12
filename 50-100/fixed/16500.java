@it.uniroma2.scorci.scanner.poiscraper.annotation.ParserMethod(query = it.uniroma2.scorci.scanner.impl.duespaghi.DueSpaghiPoiWebScraperAnnotation.RATING_QUERY_VALUE)
public void ratingParser(org.jsoup.select.Elements elements) {
    if ((elements.size()) == 1) {
        java.lang.String ratingValue = elements.get(0).ownText();
        if (ratingValue != null) {
            try {
                it.uniroma2.scorci.scanner.impl.duespaghi.RestaurantRating rating = ((it.uniroma2.scorci.scanner.impl.duespaghi.RestaurantRating) (poi.getRating()));
                rating.setValue(java.lang.Double.parseDouble(ratingValue.trim()));
            } catch (java.lang.NumberFormatException e) {
            }
        }
    }
}