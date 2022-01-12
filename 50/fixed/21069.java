@java.lang.Override
public edu.utsa.fileflow.client.fileflow.FileStructure clone() {
    edu.utsa.fileflow.client.fileflow.FileStructure clone = new edu.utsa.fileflow.client.fileflow.FileStructure();
    clone.files = files.clone();
    return clone;
}