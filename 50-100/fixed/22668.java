private java.util.Map<java.lang.String, java.lang.String> makeBreadcrumbs(java.lang.String url, java.util.Locale locale) {
    java.util.Map<java.lang.String, java.lang.String> breadcrumbs = splitUrl(url);
    setBreadcrumbsLabels(breadcrumbs, locale);
    ((java.util.TreeMap<java.lang.String, java.lang.String>) (breadcrumbs)).pollFirstEntry();
    return breadcrumbs;
}