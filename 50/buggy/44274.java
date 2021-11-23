@java.lang.Override
public boolean canPlaceRoad(shared.locations.EdgeLocation edgeLoc) {
    return client.clientFacade.ClientFacade.getInstance().canBuildCity(y, direction);
}