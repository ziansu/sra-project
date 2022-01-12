public void removeNavigator(com.minespaceships.mod.overhead.ChatRegisterEntity entity) {
    navigators.remove(entity);
    for (java.util.Iterator<com.minespaceships.mod.spaceship.Spaceship> shipIt = ships.iterator(); shipIt.hasNext();) {
        com.minespaceships.mod.spaceship.Spaceship ship = shipIt.next();
        if (((ship.getNavigatorCount()) == 0) && (ship.canBeRemoved())) {
            ship.removeNavigator(entity);
            shipIt.remove();
        }
    }
}