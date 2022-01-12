public boolean ask(java.lang.String username, java.lang.String item, int qty, double price) {
    if (server.Server.isStockExists(item)) {
        models.user.User user = new models.user.User(null, username);
        server.Server.addAsk(user, models.trade.Stock.valueOf(item), qty, price, null);
        return true;
    }
    return false;
}