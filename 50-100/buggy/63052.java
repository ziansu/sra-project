public void save(ru.javawebinar.basejava.model.Resume r) {
    int index = getIndex(r.getUuid());
    if (index >= 0) {
        java.lang.System.out.println((("Resume " + (r.getUuid())) + " already exist"));
    }else
        if ((size) >= (ru.javawebinar.basejava.storage.AbstractArrayStorage.STORAGE_LIMIT)) {
            java.lang.System.out.println("Storage overflow");
        }else {
            saveHelper(r, index);
        }
    
}