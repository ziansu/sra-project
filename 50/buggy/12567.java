@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    com.markupartist.sthlmtraveling.provider.planner.JourneyQuery journeyQuery = com.markupartist.sthlmtraveling.PlannerActivity.getJourneyQuery(cursor);
    inflateView(view, journeyQuery, cursor);
}