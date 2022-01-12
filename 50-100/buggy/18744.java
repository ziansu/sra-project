private void removeLock(int transactionID, java.io.Serializable key, ch.epfl.tkvs.transactionmanager.lockingunit.LockType lockType) {
    if (locks.containsKey(key)) {
        locks.get(key).get(lockType).remove(new java.lang.Integer(transactionID));
    }
    for (ch.epfl.tkvs.transactionmanager.lockingunit.LockType lt : locks.get(key).keySet()) {
        if (!(locks.get(key).get(lt).isEmpty())) {
            return ;
        }
    }
    locks.remove(key);
}