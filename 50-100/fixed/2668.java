private static java.lang.String extractSectionFromFacebookUrl(final java.lang.String url, int sectionNumber) {
    java.util.regex.Matcher matcher = pw.rapit.likes.service.FacebookFetcherService.FB_URL_PATTERN.matcher(url);
    if (matcher.find()) {
        java.lang.String substringWithPageName = substring(url, matcher.end());
        java.lang.String[] split = split(substringWithPageName, pw.rapit.likes.service.FacebookFetcherService.FORWARD_SLASH, 4);
        if (sectionNumber < (split.length)) {
            return split[sectionNumber];
        }else {
            return null;
        }
    }
    return url;
}