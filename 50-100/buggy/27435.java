public boolean commitPrimaryColumn(io.fluo.core.impl.TransactionImpl.CommitData cd, io.fluo.core.oracle.Stamp commitStamp) throws org.apache.accumulo.core.client.AccumuloException, org.apache.accumulo.core.client.AccumuloSecurityException {
    if ((startTs) <= (commitStamp.getGcTimestamp())) {
        rollback(cd);
        return false;
    }
    return commitPrimaryColumn(cd, commitStamp.getTimestamp());
}