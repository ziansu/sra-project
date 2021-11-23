public java.lang.String getSessionKey() {
    java.lang.System.out.println("Getting session key!");
    if (((this.seqNum) < 0) && ((this.seqMax) == (-1)))
        return null;
    
    if ((keyExpired()) || ((this.seqNum) < 0)) {
        currKey = getNextKey();
    }
    (this.usesLeft)--;
    com.bccs.bsecure.SecurityContact.database.setContactUsesLeft(this.getId(), this.usesLeft);
    return getKey();
}