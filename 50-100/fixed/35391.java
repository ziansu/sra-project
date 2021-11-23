@java.lang.Override
public boolean checkSat(jbse.bc.ClassHierarchy hier, boolean value) throws java.io.IOException, jbse.dec.exc.ExternalProtocolInterfaceException {
    if (!(this.hasCurrentClause)) {
        throw new jbse.dec.exc.ExternalProtocolInterfaceException("Attempted to check satisfiability with no current clause.");
    }
    final java.lang.String queryPush = (value) ? this.currentClausePositive : this.currentClauseNegative;
    if (queryPush == null) {
        return true;
    }
    sendAndCheckAnswer(queryPush);
    final boolean isSat = sendAndCheckAnswerChecksat();
    sendAndCheckAnswer(jbse.dec.DecisionProcedureExternalInterfaceSMTLIB2_AUFNIRA.POP_1);
    return isSat;
}