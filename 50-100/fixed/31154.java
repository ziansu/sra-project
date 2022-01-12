protected boolean pickAndExecuteAnAction() {
    for (restaurant.HostAgent.Table table : tables) {
        if (!(table.isOccupied())) {
            if (!(waitingCustomers.isEmpty())) {
                tellWaiter(waitingCustomers.get(0), table);
                return true;
            }
        }
    }
    return false;
}