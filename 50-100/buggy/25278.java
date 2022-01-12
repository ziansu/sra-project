private void writeToCommBus() {
    if (isDataOutBuffer)
        try {
            if (commBus.write(connector, dataType, byteDataBuffer)) {
                isDataOutBuffer = false;
                exceptionThrown = null;
            }
        } catch (hu.nik.project.communication.CommBusException e) {
            isDataOutBuffer = false;
            exceptionThrown = e;
        }
    
}