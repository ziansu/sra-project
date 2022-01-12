protected void buildSuggestionsFromSubstepsSource(uk.co.itmoore.intellisubsteps.psi.stepdefinition.psi.SubstepsDefinitionFile substepsDefFile, final java.util.List<java.lang.String> substepDefinitions) {
    uk.co.itmoore.intellisubsteps.StepValidatorAnnotator.logger.debug(("buildSuggestionsFromSubstepsSource for file: " + (substepsDefFile.getName())));
    java.lang.String[] lines = substepsDefFile.getText().split("\n");
    for (java.lang.String line : lines) {
        if (line.trim().startsWith("Define:")) {
            java.lang.String def = org.apache.commons.lang.StringUtils.stripStart(line.trim(), "Define:").trim();
            substepDefinitions.add(def);
        }
    }
}