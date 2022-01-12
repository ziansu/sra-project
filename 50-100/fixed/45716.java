private void compileAndEvaluateJavaAction(com.actions.JavaAction createdAction) throws java.lang.Exception {
    com.javasource.InterpreterSuperClass superClass = com.interpret.JavaInterpreterCompiler.getInstance().compile(createdAction, true);
    if (superClass != null) {
        java.lang.System.out.println(((superClass.evaluate()) + "\n"));
    }
}