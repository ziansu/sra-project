public boolean seenURL(edu.uci.ics.crawler4j.url.WebURL url) {
    java.lang.String canonicalUrl = edu.uci.ics.crawler4j.url.URLCanonicalizer.getCanonicalURL(url.getURL());
    java.lang.Long added = server.sadd(dupefilterKey, canonicalUrl);
    if (added == 0) {
        cloudwalk.slave.crawler.Dupefilter.logger.trace("{} is seen before", canonicalUrl);
    }
    return added == 0;
}