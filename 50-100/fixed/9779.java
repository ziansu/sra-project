@java.lang.Override
public int hashCode() {
    int hcode = java.util.Objects.hash(getDisplayName(), getSummandExpression());
    java.util.Iterator<?> vmIter = this.getMatchers().iterator();
    while (vmIter.hasNext()) {
        hcode += vmIter.next().hashCode();
    } 
    return hcode;
}