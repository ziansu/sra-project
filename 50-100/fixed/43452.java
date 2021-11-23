@java.lang.Override
public void onDoorClicked(com.inveitix.android.clue.cmn.Door door) {
    android.content.Intent intent = new android.content.Intent(this, com.inveitix.android.clue.ui.MapActivity.class);
    intent.putExtra(com.inveitix.android.clue.ui.MapActivity.EXTRA_MUSEUM_ID, museumId);
    intent.putExtra(com.inveitix.android.clue.ui.MapActivity.EXTRA_ROOM_ID, door.getConnectedTo());
    intent.putExtra(com.inveitix.android.clue.ui.MapActivity.EXTRA_PREVIOUS_ROOM_ID, room.getId());
    startActivity(intent);
}