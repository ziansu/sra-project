private boolean writeToCommBus() {
    if (isDataOutBuffer)
        try {
            if (commBus.write(connector, dataType, byteDataBuffer)) {
                isDataOutBuffer = false;
                exceptionThrown = null;
                return true;
            }
        } catch (hu.nik.project.communication.CommBusException e) {
            isDataOutBuffer = false;
            exceptionThrown = e;
            return false;
        }
    
    return false;
}