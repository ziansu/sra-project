@java.lang.Override
public final void pushAssumption(jbse.mem.Clause c) throws jbse.dec.exc.DecisionException {
    pushAssumptionLocal(c);
    if (hasNext()) {
        final jbse.mem.Clause cSimpl = simplifyLocal(c);
        this.next.pushAssumption(cSimpl);
    }
}