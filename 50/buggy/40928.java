@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    android.widget.TextView tv = ((android.widget.TextView) (view));
    tv.setText(convertCursorRowToUXFormat(cursor));
}