@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String roomNum = ((java.lang.String) (parent.getItemAtPosition(position)));
    t.setText(("Item Selected: " + roomNum));
    int roomIndex = mP.rooms.indexOf(roomNum);
    endPoint = mP.roomCoords.get(roomIndex);
    endPointSet = true;
    if (startPointSet) {
        mapPath();
    }
}