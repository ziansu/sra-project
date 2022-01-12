@java.lang.Override
public void onClick(android.view.View v) {
    data.remove(text);
    data.add(0, text);
    notifyDataSetChanged();
    closeAllItems();
}