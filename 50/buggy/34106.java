public boolean isInternalNetwork(java.lang.String ownerNumber, java.lang.String callNumber) {
    if ((this.VerifyNetwork(ownerNumber)) == (this.VerifyNetwork(callNumber)))
        return true;
    
    return false;
}