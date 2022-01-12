public java.lang.Void call() throws java.lang.Exception {
    for (int i = beginIndex; i < ((beginIndex) + (count)); i++) {
        dm.indexMetadata(((ids[i]) + ""), false);
    }
    return null;
}