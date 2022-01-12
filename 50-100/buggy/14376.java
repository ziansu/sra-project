@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    view.setSelected(true);
    java.lang.String place = placeType.getItemAtPosition(position).toString();
    if (placesMap.containsKey(place)) {
        placeTypeSelection = place;
    }else {
        placeTypeSelection = "restaurant";
    }
}