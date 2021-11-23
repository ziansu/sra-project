@java.lang.Override
public void readFields(java.io.DataInput in) throws java.io.IOException {
    int numWorkUnits = in.readInt();
    for (int i = 0; i < numWorkUnits; i++) {
        gobblin.source.workunit.WorkUnit workUnit = new gobblin.source.workunit.WorkUnit(null, null);
        workUnit.readFields(in);
        this.workUnits.add(workUnit);
    }
}