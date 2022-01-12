@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    android.widget.TextView message = ((android.widget.TextView) (view.findViewById(R.id.message)));
    java.lang.String person = cursor.getString(MainActivity.COL_PERSON);
    java.lang.String messageText = cursor.getString(MainActivity.COL_BODY);
    message.setText(((person + ":\n") + messageText));
}