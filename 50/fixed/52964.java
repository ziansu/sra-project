public edu.utsa.fileflow.filestructure.FileStructure merge(edu.utsa.fileflow.filestructure.FileStructure source) {
    return clone().mergeImpl(source.clone());
}