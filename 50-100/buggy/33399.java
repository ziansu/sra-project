@org.jetbrains.annotations.Nullable
public java.util.List<com.davidmis.elmplugin.ElmError> doAnnotate(com.davidmis.elmplugin.ElmExternalAnnotator.InitialInfo info) {
    com.intellij.openapi.fileEditor.FileDocumentManager.getInstance().saveDocument(info.document);
    java.lang.System.out.println((("Checking: " + (info.vfile.getPath())) + "    ---------------------------------------"));
    java.lang.String compilerOutput = ElmChecker.instance.getCompilerOutput(info.vfile.getPath());
    java.lang.System.out.println(compilerOutput);
    java.lang.System.out.println("------------------------------------------------------");
    return getErrors(compilerOutput, info.document);
}