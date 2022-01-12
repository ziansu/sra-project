@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    before();
    java.lang.Throwable failure = null;
    try {
        base.evaluate();
    } catch (java.lang.Throwable t) {
        failure = t;
    } finally {
        try {
            after();
        } catch (java.lang.Throwable t) {
            if (failure == null) {
                throw t;
            }else {
                throw new org.junit.runners.model.MultipleFailureException(java.util.Arrays.asList(failure, t));
            }
        }
    }
}