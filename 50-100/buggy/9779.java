@java.lang.Override
public int hashCode() {
    int hcode = java.util.Objects.hash(getDisplayName(), getSummandExpression());
    java.util.Iterator<gov.va.med.srcalc.domain.model.ValueMatcher> vmIter = this.getMatchers().iterator();
    while (vmIter.hasNext()) {
        hcode += vmIter.next().hashCode();
    } 
    return hcode;
}