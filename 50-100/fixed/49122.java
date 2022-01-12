private int countOpenOrders() {
    int openOrders = 0;
    for (int s = 0; s < (isMember() ? 7 : 3); s++) {
        java.lang.String orderType = ctx.widgets.component(GrandExchangeAlcher.GrandExchangeAlcher.grandExchange.WIDGET, ((GrandExchange.FIRST_SLOT_COMPONENT) + s)).component(1).text();
        if ((orderType.equals("Buy")) || (orderType.equals("Sell"))) {
            openOrders++;
        }
    }
    return openOrders;
}