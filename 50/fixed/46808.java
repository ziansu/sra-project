@java.lang.Override
public void onClick(android.view.View view) {
    orderEntries.remove(position);
    notifyDataSetChanged();
}