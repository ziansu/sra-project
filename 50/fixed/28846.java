@java.lang.Override
public void fireChannelUnexpectedlyClosed() {
    this.wrappedSmppSessionHandler.fireChannelUnexpectedlyClosed();
    if ((this.esme.getSmppSession()) != null) {
        this.esme.getSmppSession().close();
    }
    scheduleConnect(this.esme);
}