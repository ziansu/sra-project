@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(getApplication(), ((com.socks.selectcitymodule.view.CitySortModel) (adapter.getItem(position))).getName(), Toast.LENGTH_SHORT).show();
}