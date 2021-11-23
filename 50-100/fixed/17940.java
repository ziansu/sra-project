@org.junit.Test(expected = org.cinchapi.concourse.server.storage.TransactionStateException.class)
public void testAtomicOperationFromTransactionFailsIfVersionChangesWithCommit() {
    org.cinchapi.concourse.server.storage.Transaction txn = ((org.cinchapi.concourse.server.storage.Transaction) (this.store));
    org.cinchapi.concourse.server.storage.AtomicOperation operation = txn.startAtomicOperation();
    operation.fetch("foo", 1);
    org.cinchapi.concourse.server.storage.Engine engine = ((org.cinchapi.concourse.server.storage.Engine) (this.destination));
    operation.commit();
    engine.add("foo", org.cinchapi.concourse.util.Convert.javaToThrift("bar"), 1);
    org.junit.Assert.assertFalse(txn.commit());
}