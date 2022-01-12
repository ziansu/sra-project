@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    edit.setText(searchList.get(position).split(" / ")[0]);
    edit.setTag(searchList.get(position).split(" / ")[1]);
    closeSearchResult();
}