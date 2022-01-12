public boolean modify(int index, udo.storage.Task modifiedTask) {
    if (index >= (udo.storage.Storage.taskList.size())) {
        return false;
    }
    udo.storage.Storage.prevTask = udo.storage.Storage.taskList.get(index);
    udo.storage.Storage.prevCmd = "mod";
    udo.storage.Storage.taskList.set(index, modifiedTask);
    udo.storage.JsonProcessor.writeJson(lastPath, udo.storage.Storage.taskList);
    return true;
}