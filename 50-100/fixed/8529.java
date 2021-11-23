private void processEvent(round_robin.Event event) {
    switch (event.getType()) {
        case Event.NEW_PROCESS :
            createProcess();
            break;
        case Event.SWITCH_PROCESS :
            switchProcess();
            break;
        case Event.END_PROCESS :
            endProcess();
            break;
        case Event.IO_REQUEST :
            processIoRequest();
            break;
        case Event.END_IO :
            endIoOperation();
            break;
    }
}