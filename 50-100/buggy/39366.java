@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View v = inflater.inflate(R.layout.journey_history_row, parent, false);
    com.markupartist.sthlmtraveling.provider.planner.JourneyQuery journeyQuery = com.markupartist.sthlmtraveling.PlannerActivity.getJourneyQuery(cursor);
    inflateView(v, journeyQuery, cursor);
    return v;
}