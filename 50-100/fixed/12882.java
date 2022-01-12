public boolean canPlaceRoadAtLocation(int playerIndex, client.models.mapdata.EdgeLocation edge) {
    if ((this.getEdgeOwner(edge)) != (-1))
        return false;
    
    java.lang.Integer[] surrOwners = this.getAdjacentEdgeOwners(edge);
    if (surrOwners == null)
        return false;
    
    if (java.util.Arrays.asList(surrOwners).contains(playerIndex))
        return true;
    else
        return false;
    
}