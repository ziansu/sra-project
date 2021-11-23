@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    T item = ((T) (parent.getAdapter().getItem(position)));
    if ((dataInterface) != null) {
        dataInterface.onItemLongPressed(item);
    }
    return true;
}