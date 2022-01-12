@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o instanceof com.roamingroths.cmcc.data.Observation) {
        com.roamingroths.cmcc.data.Observation that = ((com.roamingroths.cmcc.data.Observation) (o));
        if ((this.flow) != (that.flow)) {
            return false;
        }
        if ((this.occurrences) != (that.occurrences)) {
            return false;
        }
        if (!(com.google.common.base.Objects.equal(this.dischargeSummary, that.dischargeSummary))) {
            return false;
        }
        return true;
    }
    return false;
}