void deleteByIndex(int listIndex, int taskIndex) throws java.lang.Exception {
    java.util.ArrayList<taskey.logic.Task> targetList = taskLists.get(listIndex);
    if ((taskIndex >= (targetList.size())) || (taskIndex <= (-1))) {
        throw new java.lang.Exception(LogicConstants.MSG_EXCEPTION_INVALID_INDEX);
    }
    taskey.logic.Task toDelete = targetList.get(taskIndex);
    removeFromAllLists(toDelete);
}