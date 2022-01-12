@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View v = inflater.inflate(edu.neu.acm.huskyhunters.CluesData.CluesAdapter.layout, parent, false);
    java.lang.String solved = cursor.getString(cursor.getColumnIndex(Constants.KEY_SOLVED));
    if (solved != "solved") {
        v.setBackgroundResource(R.drawable.list_item_solved);
        v.invalidate();
    }
    return v;
}