private void findHrefs() {
    java.util.regex.Matcher matcher = hrefPattern.matcher(Html);
    java.lang.String link = "";
    while (matcher.find()) {
        link = matcher.group();
        if (((!(Suspectedlinks.contains(link))) && (CrawlerHandler.CheckIfUrlBeenCrawled(link))) && (isValidDomain(link))) {
            Suspectedlinks.add(link);
        }
    } 
}