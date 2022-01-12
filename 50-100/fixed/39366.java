@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    com.markupartist.sthlmtraveling.provider.planner.JourneyQuery journeyQuery = com.markupartist.sthlmtraveling.PlannerActivity.getJourneyQuery(cursor);
    android.view.View v;
    if (journeyQuery != null) {
        v = inflater.inflate(R.layout.journey_history_row, parent, false);
        inflateView(v, journeyQuery, cursor);
    }else {
        v = new android.view.View(this);
    }
    return v;
}