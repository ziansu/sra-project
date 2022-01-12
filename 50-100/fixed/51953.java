@java.lang.Override
public int getCurrency() {
    try {
        currencyCache.Open(this);
        int tmp = currencyCache.get(this);
        currencyCache.Close(this);
        return tmp;
    } catch (java.lang.Exception e) {
        messageEvent.fire(this, new com.blochstech.bitcoincardterminal.Interfaces.Message((("Error: " + (e.getMessage())) + (e.toString())), com.blochstech.bitcoincardterminal.Interfaces.Message.MessageType.Error));
    }
    return 0;
}