public void leaveStation() {
    hasLeaved = true;
    if ((currStation) instanceof courier.RefugeeIsland) {
        (((courier.RefugeeIsland) (currStation)).carParkAvailable)++;
        ((courier.RefugeeIsland) (currStation)).tickHolder.remove(this);
    }
    if ((stationTo) instanceof courier.RefugeeIsland) {
        (((courier.RefugeeIsland) (stationTo)).carParkAvailable)--;
        carParkTicket = stationTo.name;
        ((courier.RefugeeIsland) (stationTo)).tickHolder.add(this);
    }
}