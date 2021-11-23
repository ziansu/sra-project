@java.lang.Override
public void setVariable(int index, java.lang.Object value) {
    try {
        variableTable.set(((clojure.lang.IPersistentVector) (variableTable.deref())).assocN(index, value));
    } catch (java.lang.IllegalStateException ise) {
        throw getRuntime().newConcurrencyError(ise.getLocalizedMessage());
    }
}