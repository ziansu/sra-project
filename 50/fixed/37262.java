public int getCurrentCostOfPlace(Brokers.BrokerManagerComponent.BrokerPlace brokerPlace) {
    int[] costList = brokerPlace.getCostList();
    int houses = brokerPlace.getHouses();
    return costList[(houses == 0 ? 0 : houses - 1)];
}