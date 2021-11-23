@java.lang.Override
public void incomingNewItem() {
    if ((newWorkerManager.isNew) || (1 == (hasLoadPage))) {
        view.showNewMsgView();
    }
}