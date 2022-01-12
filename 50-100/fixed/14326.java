public Statuses.ShipStatus deadOrAlive() {
    boolean alive = false;
    for (int i = 0; i < (this.decksStatuses.length); i++) {
        java.lang.String strStatus = decksStatuses[i].toString();
        if ((Statuses.ShipStatus.valueOf(strStatus)) == (Statuses.ShipStatus.ALIVE)) {
            alive = true;
        }
    }
    return alive ? Statuses.ShipStatus.ALIVE : Statuses.ShipStatus.DEAD;
}