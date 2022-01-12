private static java.lang.String extractSectionFromFacebookUrl(final java.lang.String url, int sectionNumber) {
    java.util.regex.Matcher matcher = pw.rapit.likes.service.FacebookFetcherService.FB_URL_PATTERN.matcher(url);
    if (matcher.find()) {
        java.lang.String substringWithPageName = substring(url, matcher.end());
        return split(substringWithPageName, pw.rapit.likes.service.FacebookFetcherService.FORWARD_SLASH, 4)[sectionNumber];
    }
    return url;
}