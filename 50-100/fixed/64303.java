private int launchCompiler(com.siberika.idea.pascal.jps.compiler.PascalBackendCompiler compiler, com.siberika.idea.pascal.jps.compiler.CompilerMessager messager, java.lang.String[] cmdLine, java.io.File workingDir) throws java.io.IOException {
    java.lang.Process process = java.lang.Runtime.getRuntime().exec(cmdLine, null, workingDir);
    com.intellij.execution.process.BaseOSProcessHandler handler = new com.intellij.execution.process.BaseOSProcessHandler(process, cmdLine[0], java.nio.charset.Charset.defaultCharset());
    com.intellij.execution.process.ProcessAdapter adapter = compiler.getCompilerProcessAdapter(messager);
    handler.addProcessListener(adapter);
    handler.startNotify();
    handler.waitFor();
    return process.exitValue();
}