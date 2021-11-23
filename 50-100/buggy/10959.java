@java.lang.Override
public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement base, org.junit.runner.Description description) {
    org.junit.runners.model.Statement newStatement = base;
    for (org.junit.runners.model.TestClass extension : extensions) {
        newStatement = prepareBeforeClasses(extension, base);
        newStatement = prepareAfterClasses(extension, newStatement);
        newStatement = prepareRules(extension, newStatement, description);
        newStatement = prepareBefores(extension, newStatement, null);
        newStatement = prepareAfters(extension, newStatement, null);
    }
    return newStatement;
}