@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.TextView currentItem = ((android.widget.TextView) (view));
    strikeThroughTextView(currentItem);
    return false;
}