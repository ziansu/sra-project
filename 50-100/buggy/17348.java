public static java.util.List<entity.TravelPossibility> testGet() {
    java.util.List<entity.TravelPossibility> possibilities = factory.ScraperFactory.getScraper("flixbus_scraper.txt").scrape();
    Cache.store(possibilities);
    java.util.List<entity.TravelPossibility> obbPossibilities = factory.ScraperFactory.getScraper("obb_scraper.txt").scrape();
    Cache.store(obbPossibilities);
    possibilities.addAll(obbPossibilities);
    return possibilities;
}