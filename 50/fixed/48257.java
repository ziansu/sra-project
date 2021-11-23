public void saveTableName() {
    exchangeRates.setTableName(document.select("p[class=\"nag\"]").text());
}