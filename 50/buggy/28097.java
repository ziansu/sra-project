private void lap() {
    if ((this._startTime) == null)
        return ;
    
    java.time.LocalDateTime stopTime = stop();
    start(stopTime);
}