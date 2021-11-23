private void processErrorEvent(final org.apache.catalina.CometEvent ce, final org.raven.ui.servlet.RequestContext ctx) throws java.io.IOException, javax.servlet.ServletException {
    try {
        if ((ce.getEventSubType()) == (CometEvent.EventSubType.TIMEOUT))
            ctx.tryToCloseChannel(ce);
        else
            ctx.forceCloseChannel(ce);
        
    } finally {
    }
}