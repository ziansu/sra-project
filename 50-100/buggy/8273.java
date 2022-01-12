private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.Scenario scenario) {
    if (scenario.getKeyword().equals("Scenario Outline")) {
        return org.jetbrains.plugins.cucumber.java.run.CucumberJvmSMFormatter.escape(("Scenario: Line: " + (scenario.getLine())));
    }else {
        return org.jetbrains.plugins.cucumber.java.run.CucumberJvmSMFormatter.escape(("Scenario: " + (scenario.getName())));
    }
}