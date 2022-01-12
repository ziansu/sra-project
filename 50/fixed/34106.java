public boolean isInternalNetwork(java.lang.String ownerNumber, java.lang.String callNumber) {
    if (this.VerifyNetwork(ownerNumber).equals(this.VerifyNetwork(callNumber)))
        return true;
    
    return false;
}