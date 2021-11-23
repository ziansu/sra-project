@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != 0) {
        searchView.setText(hotWords.get(position), true);
        removeCover(true);
        layoutSearch.performClick();
    }else {
        searchView.setText("");
    }
}