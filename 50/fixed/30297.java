@java.lang.Override
public void incomingNewItem() {
    if (newWorkerManager.isNew) {
        view.showNewMsgView();
    }
}