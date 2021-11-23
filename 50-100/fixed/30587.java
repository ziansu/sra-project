@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    try {
        before();
        statement.evaluate();
    } catch (java.lang.Exception e) {
        throw new br.com.lemao.environment.exception.EnvironmentException(getGivenEnvironmentAnnotation().getClass(), getGivenEnvironmentAnnotation().environmentName(), e);
    } finally {
        after();
    }
}