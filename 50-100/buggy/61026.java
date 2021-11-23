public java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>> getTradeInfo(int traderId) throws java.rmi.RemoteException {
    synchronized(this.tradeInfo) {
        java.lang.System.out.println(((("Server " + (myId)) + " received pulling tradeInfo request from Trader ") + traderId));
        return new java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Integer>>(this.tradeInfo);
    }
}