@java.lang.Override
public void onSuccess(java.util.List<com.zaxxis.gpfs.shared.NodeState> result) {
    store.replaceAll(result);
    processingWait = false;
}