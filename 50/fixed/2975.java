public void connect() {
    setNameAndHost();
    if (isLegit(name, host)) {
        connectAndStartReadingThread();
        changeViewAfterConnect();
    }else {
        control.view.result.append("INVALID NAME. NAME MUST NOT HAVE SPACE. NAME MUST NOT EMPTY \n");
    }
}