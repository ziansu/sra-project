@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position == 0) {
        clearData(1);
    }else
        if (position == ((cityNames.size()) - 1)) {
            showAddOtherCityDialog();
        }else {
            loadAreaData(cityList.get(position).getId(), null);
        }
    
}