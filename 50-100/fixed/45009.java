@java.lang.Override
public void init() throws java.lang.Exception {
    seedu.todo.commons.util.FileUtil.removeFile(new java.io.File(saveFileLocation));
    seedu.todo.commons.util.FileUtil.removeFile(new java.io.File(configFileLocation));
    super.init();
    if ((initialDataSupplier.get()) != null) {
        seedu.todo.models.TodoListDB db = seedu.todo.models.TodoListDB.getInstance();
        seedu.todo.storage.Storage storage = new seedu.todo.storage.JsonStorage();
        storage.save(initialDataSupplier.get());
        db.setStorage(storage);
    }
}