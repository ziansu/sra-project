public edu.emory.mathcs.nlp.component.dep.DEPArc copy() {
    edu.emory.mathcs.nlp.component.dep.DEPArc depCopy = new edu.emory.mathcs.nlp.component.dep.DEPArc();
    depCopy.set(new edu.emory.mathcs.nlp.component.dep.DEPNode(getNode()), getLabel());
    return depCopy;
}