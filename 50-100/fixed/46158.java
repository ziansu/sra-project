public void addRoute(com.logistic.model.systemunits.entities.Road road, com.logistic.model.systemunits.entities.Order order) {
    com.logistic.model.systemunits.entities.Route route = new com.logistic.model.systemunits.entities.Route();
    route.setId(getId());
    route.setRoad(road);
    route.setOrder(order);
    routes.add(route);
}