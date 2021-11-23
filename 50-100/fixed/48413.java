@java.lang.Override
public void close() throws me.legrange.panstamp.ModemException {
    try {
        modem.close();
    } catch (me.legrange.swap.SwapException ex) {
        throw new me.legrange.panstamp.ModemException(ex.getMessage(), ex);
    } finally {
        modem.removeListener(receiver);
    }
    fireNetworkClosed();
}