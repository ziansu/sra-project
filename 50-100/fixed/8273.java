private static java.lang.String getName(org.jetbrains.plugins.cucumber.java.run.Scenario scenario) {
    if (scenario.getKeyword().equals("Scenario Outline")) {
        return escape(("Scenario: Line: " + (scenario.getLine())));
    }else {
        return escape(("Scenario: " + (scenario.getName())));
    }
}