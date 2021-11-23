@java.lang.Override
public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement statement, org.junit.runner.Description description) {
    java.lang.System.out.println("applying rule");
    return new edu.mscd.thesis.util.JavaFXThreadingRule.OnJFXThreadStatement(statement);
}