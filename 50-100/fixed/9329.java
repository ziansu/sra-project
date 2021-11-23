private void updateOkDisabled() {
    okDisabled.setValue((((((selectedOfficer) == null) || ((selectedAthletes.size()) < (Game.MIN_PARTICIPANTS))) || ((selectedAthletes.size()) > (Game.MAX_PARTICIPANTS))) || ((predictedAthlete) == null)));
}