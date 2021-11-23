private void SynchroniserIntervention() {
    if (((!(synchronisationBloquer)) && ((mGoogleMap) != null)) && (!(reloadingIntervention))) {
        reloadingIntervention = true;
        chargerIntervention();
    }
}