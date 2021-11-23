@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String aux = ((java.lang.String) (adapter.getItem(position)));
    adapter.clear();
    path.cleanQuery();
    setLista(ids[position]);
}