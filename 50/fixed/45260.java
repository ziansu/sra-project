public java.util.Set<java.lang.String> networksForRouteId(java.lang.String routeId) {
    lock.lock();
    java.util.Set<java.lang.String> networks = routeMap.get(java.lang.Integer.parseInt(routeId));
    lock.unlock();
    return networks;
}