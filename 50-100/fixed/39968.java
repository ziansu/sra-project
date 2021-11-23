public com.manifest.solutionsubmission.SolutionProxy tryNewSolutionProxy(com.manifest.server.dataobjects.SolutionSubmission submission) throws java.lang.Exception {
    java.lang.Class<?> solutionClass = org.mdkt.compiler.InMemoryJavaCompiler.compile("Solution", submission.getSourceCode());
    java.lang.Object solutionInstance = solutionClass.newInstance();
    java.lang.reflect.Method targetedMethod = solutionClass.getMethod(submission.getMethodName(), submission.getParameterClasses());
    com.manifest.solutionsubmission.SolutionProxy solutionProxy = new com.manifest.solutionsubmission.SolutionProxy();
    solutionProxy.setSolutionInstance(solutionInstance);
    solutionProxy.setTargetedMethod(targetedMethod);
    return solutionProxy;
}