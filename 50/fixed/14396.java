public static void main(java.lang.String[] args) {
    trading.Trader trader = new trading.Trader();
    if (!(trader.socket.connection.isConnected())) {
        return ;
    }
    trader.socket.disconnect();
}