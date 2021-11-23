@java.lang.Override
public <T> void visitCtInvocation(spoon.reflect.code.CtInvocation<T> invocation) {
    enter(invocation);
    scan(invocation.getAnnotations());
    scanReferences(invocation.getTypeCasts());
    scan(invocation.getTarget());
    scan(invocation.getArguments());
    exit(invocation);
}