private void setupViewsCompiled(java.util.Set<java.lang.String> matchingClasses) {
    for (java.lang.String matchingClass : matchingClasses) {
        ch.liquidmind.inflection.model.compiled.ViewCompiled matchingView = new ch.liquidmind.inflection.model.compiled.ViewCompiled(matchingClass);
        matchingView.setSelectionType(currentViewSelectionType);
        addOrOverrideView(currentTaxonomyCompiled.getViewsCompiled(), matchingView);
        addOrOverrideView(currentViewsCompiled, matchingView);
    }
}