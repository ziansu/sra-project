private void processEvent(round_robin.Event event) {
    java.lang.System.out.println(("event type" + (event.getType())));
    java.lang.System.out.println(("event time" + (event.getType())));
    switch (event.getType()) {
        case Event.NEW_PROCESS :
            createProcess();
            break;
        case Event.SWITCH_PROCESS :
            switchProcess();
            break;
        case Event.END_PROCESS :
            java.lang.System.out.println("fant en end_process");
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