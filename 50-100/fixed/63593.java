@java.lang.Override
public void execute() {
    boolean asTempfile = isPackageDocumentationFile();
    rmarkdownHelper_.renderRMarkdown(docUpdateSentinel_.getPath(), ((docDisplay_.getCursorPosition().getRow()) + 1), null, docUpdateSentinel_.getEncoding(), paramsFile, asTempfile, type, false, rmarkdownHelper_.getKnitWorkingDir(docUpdateSentinel_));
}