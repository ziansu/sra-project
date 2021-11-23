@java.lang.Override
public java.lang.String call() throws java.lang.Exception {
    executeAll(branch.iterator(), appSpec, instantiator, classLoader, token);
    return branch.toString();
}