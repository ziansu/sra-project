private void setActive(int active) {
    activeClient = active;
    if ((activeClient) >= 4)
        activeClient = 0;
    
    sendPersonalPacket("startTurn", active);
}