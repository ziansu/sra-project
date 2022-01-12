@conformance.PortedFrom(file = "Actor.h", name = "applicable")
protected boolean applicable(uk.ac.manchester.cs.jfact.kernel.ClassifiableEntry entry) {
    if (isRole) {
        if (isStandard) {
            return true;
        }else {
            return (entry.getId()) > 0;
        }
    }else {
        return (entry instanceof uk.ac.manchester.cs.jfact.kernel.Concept) && ((((uk.ac.manchester.cs.jfact.kernel.Concept) (entry)).isSingleton()) != (isStandard));
    }
}