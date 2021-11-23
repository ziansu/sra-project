@java.lang.Override
public void onSuccess(java.util.List<com.zaxxis.gpfs.shared.NodeState> result) {
    store.replaceAll(result);
    log.setText("Completed: mmgetstate -a");
    processingWait = false;
}