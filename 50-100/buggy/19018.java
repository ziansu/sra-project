@java.lang.Override
public void jdwpClearAllBreakpoints() {
    synchronized(delegates.state().centralLock()) {
        java.util.Iterator<org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventRequest> it = delegates.state().jdwpEventRequests().iterator();
        while (it.hasNext()) {
            org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventRequest req = it.next();
            if ((req.eventKind()) == (JdwpConsts.EventKind.BREAKPOINT)) {
                onEventRequestRemoved(req);
                it.remove();
            }
        } 
    }
}