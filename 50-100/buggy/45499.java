public void loadFile(final java.io.File file, boolean detectLanguage) {
    this.file = file;
    this.detectLanguage = detectLanguage;
    if (detectLanguage) {
        detectLanguage(file);
    }
    if ((file.length()) > 100000) {
        error("File too big (100k max)");
    }else {
        progress.setVisibility(View.VISIBLE);
        new eu.fiskur.syntaxview.FileUtils().loadByLine(file, this);
    }
}