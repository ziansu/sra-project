public int getEdgeOwner(client.models.mapdata.EdgeLocation edgeLocation) {
    client.models.mapdata.EdgeLocation altLocation = this.getAltEdge(edgeLocation);
    if ((this.roads) != null)
        for (client.models.mapdata.Road r : this.roads) {
            if ((r.getLocation().equals(edgeLocation)) || (r.getLocation().equals(altLocation)))
                return r.getOwner();
            
        }
    
    return -1;
}