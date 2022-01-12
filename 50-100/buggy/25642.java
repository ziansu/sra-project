@java.lang.Override
public org.eclipse.emf.ecore.EObject eObject(fr.inria.atlanmod.neoemf.core.Id id) {
    fr.inria.atlanmod.neoemf.core.PersistentEObject object = null;
    if (java.util.Objects.nonNull(id)) {
        org.eclipse.emf.ecore.EClass eClass = resolveInstanceOf(id);
        object = persistentObjectsCache.get(id, new fr.inria.atlanmod.neoemf.data.berkeleydb.store.DirectWriteBerkeleyDbStore.PersistentEObjectCacheLoader());
        if ((object.resource()) != (resource())) {
            object.resource(resource());
        }
    }
    return object;
}