public java.lang.Iterable<com.mpdeimos.foodscraper.data.IBistro> getBistros() throws com.mpdeimos.webscraper.ScraperException {
    this.retrieve();
    return this.bistros;
}