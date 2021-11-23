public void standUp(int seat) throws java.rmi.RemoteException {
    seatList.get(seat).standUp();
    int releasedSemaphore = seat / (seatsPerSemaphore);
    if (releasedSemaphore > ((getNumberOfSemaphores()) - 1))
        semaphoreList.get(((getNumberOfSemaphores()) - 1)).release();
    else
        semaphoreList.get(releasedSemaphore).release();
    
}