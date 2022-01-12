private void markTaskAsDone(java.lang.String input) throws java.io.IOException {
    int index = tdnext.ParserAPI.parseIndex(input);
    tdnext.Task currTask = _listTask.remove(index);
    java.lang.String oldDesc = currTask.toString();
    currTask.markAsDone();
    java.lang.String newDesc = currTask.toString();
    tdnext.StorageAPI.editToFile(oldDesc, newDesc);
    tdnext.Logic._logger.log(java.util.logging.Level.INFO, ((currTask.toString()) + " is marked as done"));
}