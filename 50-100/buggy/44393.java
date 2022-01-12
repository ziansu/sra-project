private void processErrorEvent(org.apache.catalina.CometEvent ce) throws java.io.IOException, javax.servlet.ServletException {
    try {
        org.raven.ui.servlet.RequestContext ctx = getRequestContext(ce);
        if ((ce.getEventSubType()) == (CometEvent.EventSubType.TIMEOUT))
            ctx.tryToCloseChannel(ce);
        else
            ctx.forceCloseChannel(ce);
        
    } finally {
    }
}