public void endConnection() {
    if ((this.vcNumber) < 0)
        return ;
    
    NetworkElements.ATMCell end = new NetworkElements.ATMCell(this.vcNumber, ("end " + (this.vcNumber)), this.getTraceID());
    end.setIsOAM(true);
    this.sentEnd(end);
    this.vcNumber = -1;
    this.nic.sendCell(end, this);
}