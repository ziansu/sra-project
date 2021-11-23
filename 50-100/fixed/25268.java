public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
    java.net.URL url = evt.getURL();
    if (url != null) {
        if ((evt.getEventType()) == (javax.swing.event.HyperlinkEvent.EventType.ENTERED)) {
        }else
            if ((evt.getEventType()) == (javax.swing.event.HyperlinkEvent.EventType.EXITED)) {
            }else
                if ((evt.getEventType()) == (javax.swing.event.HyperlinkEvent.EventType.ACTIVATED)) {
                    openBrowser.openURL(url.toString());
                }
            
        
    }
}