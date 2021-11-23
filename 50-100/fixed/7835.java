private void updateConnections() {
    for (Models.Location l1 : validLocations)
        for (Models.Location l2 : validLocations)
            for (Models.Location mid : validLocations)
                if ((connection.get(new Models.LocationPair(l1, mid))) && (connection.get(new Models.LocationPair(mid, l2))))
                    connection.put(new Models.LocationPair(l1, l2), true);
                
            
        
    
}