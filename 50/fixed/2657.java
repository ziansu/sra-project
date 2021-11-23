@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = "rdap.scraping.scrapers.iana.enabled")
@org.springframework.context.annotation.Bean(value = "iana")
public net.apnic.rdap.iana.scraper.IANABootstrapScraper ianaScraper() {
    if (((baseURI) != null) && ((baseURI.isEmpty()) == false)) {
        return new net.apnic.rdap.iana.scraper.IANABootstrapScraper(baseURI);
    }
    return new net.apnic.rdap.iana.scraper.IANABootstrapScraper();
}