@java.lang.Override
protected edu.utsa.fileflow.client.fileflow.FileStructure clone() {
    edu.utsa.fileflow.client.fileflow.FileStructure clone = new edu.utsa.fileflow.client.fileflow.FileStructure();
    clone.files = files.clone();
    return clone;
}