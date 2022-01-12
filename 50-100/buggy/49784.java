public boolean alertedCheckpointCreated(nl.hs_hague.urbangame.model.Checkpoint checkpoint) {
    for (int i = 0; i < (nl.hs_hague.urbangame.RoomListActivity.alertedCheckpoints.size()); i++) {
        if (nl.hs_hague.urbangame.RoomListActivity.alertedCheckpoints.get(i).getName().equals(checkpoint.getName())) {
            return true;
        }
    }
    return false;
}