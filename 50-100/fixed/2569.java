public static java.util.List<com.gymkhana.iitbapp.items.FeedSubscriptionItem> getSubscriptions(final android.content.Context context) {
    java.lang.String fileName = Constants.Filenames.INFO_FEED;
    if (fileName != null) {
        java.lang.String json = com.gymkhana.iitbapp.util.Functions.offlineDataReader(context, fileName);
        if ((json != null) && (!(json.isEmpty()))) {
            return com.gymkhana.iitbapp.util.ApiUtil.getSubscriptionListFromJson(context, json);
        }
    }
    return new java.util.ArrayList<>();
}