@java.lang.Override
public void saveToStorage() throws java.lang.Exception {
    w094j.ctrl8.database.Storage diskStorage = new w094j.ctrl8.database.DiskStorage(this.file, this.path, this.gson);
    w094j.ctrl8.database.Storage googleStorage = new w094j.ctrl8.database.GoogleStorage(this.file, this.gson);
    diskStorage.storeData();
    googleStorage.storeData();
}