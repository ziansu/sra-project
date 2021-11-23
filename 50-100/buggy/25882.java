@java.lang.Override
public void sessionChanged(final org.parosproxy.paros.model.Session session) {
    if ((getView()) != null) {
        return ;
    }
    if (java.awt.EventQueue.isDispatchThread()) {
        sessionChangedEventHandler(session);
    }else {
        try {
            java.awt.EventQueue.invokeAndWait(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    sessionChangedEventHandler(session);
                }
            });
        } catch (java.lang.Exception e) {
            org.zaproxy.zap.extension.wappalyzer.ExtensionWappalyzer.logger.error(e.getMessage(), e);
        }
    }
}