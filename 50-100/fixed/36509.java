@java.lang.Override
public void save() throws java.io.IOException {
    java.io.InputStream data = getData();
    try {
        saveData(data);
    } finally {
        data.close();
    }
    if ((listeners) != null) {
        for (com.psddev.dari.util.StorageItemListener listener : listeners) {
            try {
                listener.afterSave(this);
            } catch (java.lang.Exception error) {
                com.psddev.dari.util.AbstractStorageItem.LOGGER.warn(java.lang.String.format("Can't execute [%s] on [%s]!", listener, this), error);
            }
        }
    }
}