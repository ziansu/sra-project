@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    aux = ((java.lang.String) (adapter.getItem(position)));
    adapter.clear();
    path.cleanQuery();
    setLista(ids.get(position));
}