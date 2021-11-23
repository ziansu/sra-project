private microbat.model.trace.TraceNode findContainingControlDominator(microbat.model.trace.TraceNode node, microbat.model.trace.TraceNode controlDominator) {
    microbat.model.trace.TraceNode superControlDominator = controlDominator.getControlDominator();
    while (superControlDominator != null) {
        if (isContainedInScope(node, superControlDominator.getConditionScope())) {
            return superControlDominator;
        }
        superControlDominator = superControlDominator.getControlDominator();
    } 
    return null;
}