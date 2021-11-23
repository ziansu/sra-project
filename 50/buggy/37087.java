public void removeTerritory(edu.chl.ChalmersRisk.model.Territory t1) {
    t1.setnewOwner(Constants.EMPTY_PLAYER);
    territories.remove(t1);
}