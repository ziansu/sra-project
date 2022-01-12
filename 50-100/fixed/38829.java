public boolean undo() {
    switch (udo.storage.Storage.prevCmd) {
        case "add" :
            undoAdd();
            break;
        case "mod" :
            undoModify();
            break;
        case "del" :
            undoDelete();
            udo.storage.Storage.prevCmd = "";
            break;
        case "chDir" :
            udo.storage.Storage.prevCmd = "";
            return undoChDir();
        default :
            return false;
    }
    storeTasks();
    return true;
}