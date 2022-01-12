public void endConnection() {
    NetworkElements.ATMCell end = new NetworkElements.ATMCell(this.vcNumber, ("end " + (this.vcNumber)), this.getTraceID());
    end.setIsOAM(true);
    this.sentEnd(end);
    this.nic.sendCell(end, this);
}