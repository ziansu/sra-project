public void setInputPath(java.lang.String inputPath) {
    this.inputPath = inputPath;
    if ((getInputPath()) == null)
        setInputFilename("");
    else
        setInputFilename(java.nio.file.Paths.get(getInputPath()).getFileName().toString());
    
}