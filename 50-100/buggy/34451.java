public static void main(java.lang.String[] args) {
    dataRepresentation.AuctionEnvironment environment = new dataRepresentation.AuctionEnvironment();
    webServer.WebServer server = new webServer.WebServer(environment);
    server.start();
    auctionEngine.AuctionMainWindow window = new auctionEngine.AuctionMainWindow(environment);
    window.frame.setVisible(true);
}