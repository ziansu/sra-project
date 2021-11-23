@java.lang.Override
public java.util.Set<java.lang.String> getUserMacroNames() {
    myLock.readLock().lock();
    try {
        return new gnu.trove.THashSet(myMacros.keySet());
    } finally {
        myLock.readLock().unlock();
    }
}