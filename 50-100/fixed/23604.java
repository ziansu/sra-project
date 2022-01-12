public static void trackRankingTerm(android.content.Context context, java.util.Date start, java.util.Date end) {
    android.os.Bundle payload = new android.os.Bundle();
    if (start != null) {
        payload.putString(FirebaseAnalytics.Param.START_DATE, start.toString());
    }
    if (end != null) {
        payload.putString(FirebaseAnalytics.Param.END_DATE, end.toString());
    }
    com.google.firebase.analytics.FirebaseAnalytics.getInstance(context).logEvent(com.sjn.stamp.utils.AnalyticsHelper.CHANGE_RANKING_TERM, payload);
}