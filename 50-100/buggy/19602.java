@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((isHaveMore) && (position <= ((mAdapter.getCount()) - 1))) {
        if (listenerToSet != null) {
            listenerToSet.onItemClick(parent, view, position, id);
        }
    }else {
        if (listenerToSet != null) {
            listenerToSet.onItemClick(parent, view, position, id);
        }
    }
}