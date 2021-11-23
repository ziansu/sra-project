public void leaveStation() {
    hasLeaved = true;
    if ((currStation) instanceof courier.RefugeeIsland) {
        (((courier.RefugeeIsland) (currStation)).carParkAvailable)++;
    }
    if ((stationTo) instanceof courier.RefugeeIsland) {
        (((courier.RefugeeIsland) (stationTo)).carParkAvailable)--;
        carParkTicket = stationTo.name;
    }
}