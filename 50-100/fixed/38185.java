@java.lang.Override
public void run() {
    while (running) {
        try {
            handleUserConfirmId();
            if (handleGetProduktBatchReceptName()) {
                handleMeasuringLoop();
            }
        } catch (java.io.IOException | java.lang.NullPointerException e) {
            running = false;
            validOprId = true;
            handler.setProduktBatchStatus(transactionProduktBatchID, 0);
        }
    } 
}