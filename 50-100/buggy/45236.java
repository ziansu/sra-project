private entity.Success redoCommand() {
    entity.Success status = engine.redoTask();
    entity.Success retrievalStatus = null;
    if ((status.isSuccess()) == true) {
        retrievalStatus = parseCommand(lastRetrieve);
        if ((retrievalStatus.isSuccess()) == true) {
            status.setObj(retrievalStatus.getObj());
            setRetrievedTaskList(((java.util.ArrayList<entity.Task>) (retrievalStatus.getObj())));
        }
    }
    return status;
}