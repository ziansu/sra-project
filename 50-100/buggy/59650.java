@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    view.callOnClick();
    if ((externalItemClickListener) != null)
        externalItemClickListener.onItemClick(parent, view, position, id);
    
    if ((onItemSelectedHandler) != null)
        onItemSelectedHandler.onItemSelected(adapter.get(position));
    
}