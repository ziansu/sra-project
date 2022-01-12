@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != 0) {
        java.lang.String roomNum = ((java.lang.String) (parent.getItemAtPosition(position)));
        t.setText(("Item Selected: " + roomNum));
        int roomIndex = mP.rooms.indexOf(roomNum);
        startPointSet = true;
        startPoint = mP.roomCoords.get(roomIndex);
        if (endPointSet) {
            mapPath();
        }
    }
}