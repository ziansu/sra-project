public void addConnection(City city, int cost) {
    if (!(this.isConnected(city)))
        connections.add(new CityConnection(city, cost));
    
    if (!(city.isConnected(this)))
        city.addSecondConnection(this, cost);
    
}