public void takeControllerAction(tollbooth.TollGate.Action act) throws tollbooth.TollboothException {
    switch (act) {
        case OPEN :
            controller.open();
            (openCount)++;
            break;
        case CLOSE :
            controller.close();
            (closeCount)++;
            break;
        case RESET :
            controller.reset();
            unresponsiveMode = false;
            break;
    }
}