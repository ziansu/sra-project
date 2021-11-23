public void receiveCoordinator(java.lang.String highestId, java.lang.String[] receivers) {
    if (!(receivers[0].equals(this.id))) {
        this.leader = nodeMap.get(highestId);
        for (int i = 0; i < (receivers.length); i++) {
            if (receivers[i].equals("")) {
                receivers[i] = this.id;
                break;
            }
        }
        coordinator(highestId, receivers);
    }
}