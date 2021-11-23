@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position == 0) {
        clearData(2);
    }else {
        dialog.show();
        loadCityData(stateList.get(position).getId(), null);
    }
}