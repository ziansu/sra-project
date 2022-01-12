@java.lang.Override
public java.util.Collection<java.lang.String> getLegacyMacroNames() {
    try {
        myLock.readLock().lock();
        return new gnu.trove.THashSet(myLegacyMacros.keySet());
    } finally {
        myLock.readLock().unlock();
    }
}