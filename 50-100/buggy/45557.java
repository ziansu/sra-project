public ca.strangebrew.FermentStep delFermentStep(final int i) {
    isDirty = true;
    ca.strangebrew.FermentStep temp = null;
    if ((!(fermentationSteps.isEmpty())) && (i > (-1))) {
        temp = fermentationSteps.remove(i);
        java.util.Collections.sort(fermentationSteps);
        calcFermentTotals();
    }
    return temp;
}