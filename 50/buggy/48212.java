protected com.github.mathieudebrito.translator.FileToTranslate.Builder path(java.lang.String path) {
    fileToTranslate.pathFrom = path;
    if (com.google.common.base.Strings.isNullOrEmpty(fileToTranslate.pathTo)) {
        fileToTranslate.pathTo = path;
    }
    return this;
}