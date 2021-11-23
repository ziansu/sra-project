private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.Step step) {
    return escape((((step.getKeyword()) + " ") + (step.getName())));
}