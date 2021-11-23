@java.lang.Override
public void tickPrice(int orderId, int field, double price, int canAutoExecute) {
    if (((TickType.BID) == field) || ((TickType.ASK) == field))
        java.lang.System.out.println(((((("Ticker ID " + orderId) + " FIELD ") + field) + " PRICE ") + price));
    
}