@java.lang.Override
public void run(com.google.template.soy.soytree.SoyFileNode file, com.google.template.soy.base.internal.IdGenerator nodeIdGen) {
    new com.google.template.soy.passes.ResolveNamesVisitor(declaredSyntaxVersion, errorReporter).exec(file);
}