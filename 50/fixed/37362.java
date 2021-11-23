@org.matsim.core.config.groups.StringSetter(value = "subpopulation")
public void setSubpopulation(java.lang.String subpopulation) {
    if ((this.subpopulation) != null) {
        throw new java.lang.IllegalStateException("cannot change subpopulation in a scoring parameter set, as it is used for indexing.");
    }
    this.subpopulation = subpopulation;
}