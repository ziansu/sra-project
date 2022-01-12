public void setCurrentCheckpointText() {
    nl.hs_hague.urbangame.model.Checkpoint currentCheckpoint = nl.hs_hague.urbangame.RoomDetailFragment.currentRoom.getCurrentCheckpoint(RoomListActivity.firebaseAuth.getCurrentUser().getUid());
    java.lang.String currentHint = "";
    if (currentCheckpoint != null) {
        currentHint = currentCheckpoint.getHint();
    }else {
        currentHint = "Game completed";
    }
    txtCurrentHint.setText(currentHint);
}