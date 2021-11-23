private boolean validate() {
    if (getPickedPlayersFromAdapter().isEmpty()) {
        okButton.setError(getString(R.string.pick_players_validation_message));
        return false;
    }
    return true;
}