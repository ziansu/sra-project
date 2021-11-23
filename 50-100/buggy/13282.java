private void sendEvents() {
    try {
        int size = eventBuffer.size();
        switch (size) {
            case 0 :
                {
                    return ;
                }
            case 1 :
                {
                    inputProcessor.send(eventBuffer.get(0), currentIndex);
                    eventBuffer.clear();
                    return ;
                }
            default :
                {
                    inputProcessor.send(eventBuffer.toArray(new org.wso2.siddhi.core.event.Event[size]), currentIndex);
                    eventBuffer.clear();
                }
        }
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
}