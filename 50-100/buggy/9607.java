private void Price() {
    java.lang.String priceWithCurrency = source.getElementsByClass("price-label").text().replaceAll("\\D+", "");
    if ((priceWithCurrency.length()) == 0) {
        adBuilder.price(null);
    }
    adBuilder.price(java.lang.Integer.parseInt(priceWithCurrency));
}