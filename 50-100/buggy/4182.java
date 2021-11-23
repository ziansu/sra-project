@java.lang.Override
public boolean action() throws net.openhft.chronicle.threads.api.InvalidEventHandlerException {
    if (!(sc.isOpen()))
        throw new net.openhft.chronicle.threads.api.InvalidEventHandlerException();
    
    try {
        int read = ((inBB.remaining()) > 0) ? sc.read(inBB) : 1;
        if (read < 0) {
            closeSC();
        }else
            if (read > 0) {
                invokeHandler();
            }
        
    } catch (java.io.IOException e) {
        handleIOE(e);
    }
    return false;
}