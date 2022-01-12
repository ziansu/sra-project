private java.util.Map<java.lang.String, java.lang.String> makeBreadcrumbs(java.lang.String url, java.util.Locale locale) {
    java.util.Map<java.lang.String, java.lang.String> breadcrumbs = splitUrl(url);
    ((java.util.TreeMap<java.lang.String, java.lang.String>) (breadcrumbs)).pollFirstEntry();
    setBreadcrumbsLabels(breadcrumbs, locale);
    return breadcrumbs;
}