protected boolean pickAndExecuteAnAction() {
    for (restaurant.HostAgent.Table table : tables) {
        if (!(table.isOccupied())) {
            if (!(waitingCustomers.isEmpty())) {
                table.setOccupant(waitingCustomers.get(0));
                tellWaiter(waitingCustomers.get(0), table);
                return true;
            }
        }
    }
    return false;
}