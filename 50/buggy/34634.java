public void clearClassPath() {
    if (((org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.fileSystem) != null) && ((org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.fileSystem.getDelegate()) != null))
        org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.fileSystem.getDelegate().cleanup();
    
    classpath.clear();
    org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.fileSystem = null;
}