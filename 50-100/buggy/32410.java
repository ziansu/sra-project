public void takeControllerAction(tollbooth.TollGate.Action act) throws tollbooth.TollboothException {
    switch (act) {
        case OPEN :
            this.controller.open();
            (this.openCount)++;
            break;
        case CLOSE :
            this.controller.close();
            (this.closeCount)++;
            break;
        case RESET :
            this.controller.reset();
            this.unresponsiveMode = false;
            break;
    }
}