public void SynchroniserIntervention() {
    if (((mGoogleMap) != null) && (!(reloadingIntervention))) {
        reloadingIntervention = true;
        chargerIntervention();
    }
}