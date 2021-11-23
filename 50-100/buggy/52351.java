@java.lang.Override
public java.util.Set<org.evosuite.testcase.variable.VariableReference> getVariableReferences() {
    java.util.Set<org.evosuite.testcase.variable.VariableReference> references = new java.util.LinkedHashSet<>();
    references.add(retval);
    references.addAll(parameters);
    for (org.evosuite.testcase.variable.VariableReference param : parameters) {
        if (param == null) {
            continue;
        }
        if ((param.getAdditionalVariableReference()) != null)
            references.add(param.getAdditionalVariableReference());
        
    }
    references.addAll(getAssertionReferences());
    return references;
}