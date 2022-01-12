public int getNextCostOfPlace(Brokers.BrokerManagerComponent.BrokerPlace brokerPlace) throws Common.Exceptions.BrokerMaxAmountHousesRichedException {
    int[] costList = brokerPlace.getCostList();
    if ((brokerPlace.getCostList().length) <= (brokerPlace.getHouses()))
        throw new Common.Exceptions.BrokerMaxAmountHousesRichedException();
    
    return costList[brokerPlace.getHouses()];
}