@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    storeDirectory = testDirectory.directory(description.getMethodName());
    base.evaluate();
}