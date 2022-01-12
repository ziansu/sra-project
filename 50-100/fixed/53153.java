@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof com.emc.storageos.db.client.model.Initiator)) {
        return false;
    }
    if ((this) == object) {
        return true;
    }
    com.emc.storageos.db.client.model.Initiator that = ((com.emc.storageos.db.client.model.Initiator) (object));
    if (!(this._id.equals(that._id))) {
        return false;
    }
    java.lang.String thisPort = this.getInitiatorPort();
    java.lang.String thatPort = that.getInitiatorPort();
    return thisPort.equals(thatPort);
}