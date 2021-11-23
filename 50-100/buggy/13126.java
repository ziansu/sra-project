private void signalOn(java.io.Serializable key, ch.epfl.tkvs.transactionmanager.lockingunit.LockType lockType) {
    java.util.HashMap<ch.epfl.tkvs.transactionmanager.lockingunit.LockType, java.util.concurrent.locks.Condition> em = waitingLists.get(key);
    if ((em == null) || (!(em.containsKey(lockType)))) {
        return ;
    }
    for (ch.epfl.tkvs.transactionmanager.lockingunit.LockType lock : em.keySet()) {
        if (!(lct.areCompatible(lockType, lock))) {
            em.get(lock).signal();
        }
    }
}