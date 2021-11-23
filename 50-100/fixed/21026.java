private boolean checkDuplicate(benjaminrobert.model.Player player) {
    for (benjaminrobert.model.Player p : squad.getSquad()) {
        if (player.getImagePath().equals(p.getImagePath())) {
            if (player.equals(p)) {
                continue;
            }
            return true;
        }
    }
    return false;
}