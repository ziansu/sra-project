@java.lang.Override
public void onSuccess(java.util.Map<java.lang.String, java.lang.String> newProcessMap) {
    if (!(compareProcesses(newProcessMap))) {
        processMap = newProcessMap;
        fieldSet.removeAll();
        buildProcesses();
    }
}