private android.database.Cursor search(java.lang.String query) {
    if (!(query.equalsIgnoreCase("search_suggest_query"))) {
        final android.content.Context context = getContext();
        if (context != null) {
            org.cru.godtools.analytics.AnalyticsService.getInstance(context).trackEveryStudentSearch(query);
        }
    }
    query = query.toLowerCase();
    return mEveryStudentDatabase.getSearch(query);
}