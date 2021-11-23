@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    return android.view.LayoutInflater.from(context).inflate(R.layout.fragment_list_item, parent);
}