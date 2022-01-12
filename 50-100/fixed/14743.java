@java.lang.Override
public void execute() {
    try {
        oldDirectory = mainStorage.getCurrentDirectory();
        mainStorage.changeDirectory(newDirectory);
        pushToUndoStack();
        eventBus.post(new jfdi.logic.events.MoveDirectoryDoneEvent(newDirectory));
    } catch (jfdi.storage.exceptions.FilesReplacedException e) {
        pushToUndoStack();
        eventBus.post(new jfdi.logic.events.MoveDirectoryDoneEvent(newDirectory));
        eventBus.post(new jfdi.logic.events.FilesReplacedEvent(newDirectory, e.getReplacedFilePairs()));
    } catch (jfdi.storage.exceptions.InvalidFilePathException e) {
        eventBus.post(new jfdi.logic.events.MoveDirectoryFailedEvent(newDirectory, MoveDirectoryFailedEvent.Error.INVALID_PATH));
    }
}