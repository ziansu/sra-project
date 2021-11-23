public edu.umass.cs.gigapaxos.interfaces.ClientRequest setForceCoordinatedReads(boolean force) {
    if ((force && ((getCommandType().isRead()) || (getCommandType().isSystemLookup()))) && (this.forceCoordination = true))
        return edu.umass.cs.reconfiguration.reconfigurationpackets.ReplicableClientRequest.wrap(this, true);
    
    return this;
}