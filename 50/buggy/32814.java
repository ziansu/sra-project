boolean isEmpty() {
    if ((waitingPackets.size()) > 0)
        return false;
    
    if ((currentPayload) != null)
        return false;
    
    return true;
}