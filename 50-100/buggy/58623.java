@java.lang.Override
public void broadCastToUnit(java.lang.String client, java.lang.String remoteUnit, java.lang.String message) {
    synchronized(this) {
        rover.RoverInfo ri = rovers.get(client);
        for (rover.RoverInfo rover : rovers.values())
            if (((ri.getTeam()) == (rover.getTeam())) && (remoteUnit == (rover.getClientKey())))
                rover.receiveMessage(message);
            
        
    }
}