@javax.persistence.Column(name = "remote_target_id")
public java.lang.Integer getOutputDestination() {
    if ((outputDestination) != null)
        return outputDestination.getID();
    
    return outputDestinationID;
}