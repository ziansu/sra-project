@java.lang.Override
public synchronized void serialEvent(gnu.io.SerialPortEvent oEvent) {
    if ((oEvent.getEventType()) == (gnu.io.SerialPortEvent.DATA_AVAILABLE))
        bufferIn.dataAvailable();
    else
        if ((oEvent.getEventType()) == (gnu.io.SerialPortEvent.OUTPUT_BUFFER_EMPTY)) {
            outputEmpty = true;
            notify();
        }else
            log.warning(oEvent.getEventType());
        
    
}