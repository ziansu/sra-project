public int getNextCostOfPlace(Brokers.BrokerManagerComponent.BrokerPlace brokerPlace) throws Common.Exceptions.BrokerMaxAmountHousesRichedException {
    java.util.List<java.lang.Integer> costList = brokerPlace.getCostList();
    if ((brokerPlace.getCostList().size()) <= (brokerPlace.getHouses()))
        throw new Common.Exceptions.BrokerMaxAmountHousesRichedException();
    
    return costList.get(brokerPlace.getHouses());
}