public void setupConnection(int toAddress) {
    NetworkElements.ATMCell conn = new NetworkElements.ATMCell(0, ("setup " + toAddress), this.getTraceID());
    conn.setIsOAM(true);
    this.sentSetup(conn);
    this.nic.sendCell(conn, this);
}