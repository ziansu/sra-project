public boolean seenURL(edu.uci.ics.crawler4j.url.WebURL url) {
    if ((url.getURL()) == null)
        return true;
    
    java.lang.String canonicalUrl = edu.uci.ics.crawler4j.url.URLCanonicalizer.getCanonicalURL(url.getURL());
    if (canonicalUrl == null)
        return true;
    
    java.lang.Long added = server.sadd(dupefilterKey, canonicalUrl);
    if (added == 0) {
        cloudwalk.slave.crawler.Dupefilter.logger.trace("{} is seen before", canonicalUrl);
    }
    return added == 0;
}