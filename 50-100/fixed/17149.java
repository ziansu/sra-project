@java.lang.Override
public void refresh(java.lang.Object object) {
    if (!(isOpen())) {
        throw new cz.cvut.kbss.owlpersistence.OWLPersistenceException("The connection is closed !");
    }
    if (!(contains(object))) {
        throw new cz.cvut.kbss.owlpersistence.OWLPersistenceException("The object must be persisted so as to allow refresh.");
    }
    if (toRefresh.contains(object)) {
        loadObjectFromModel(object, true);
        toRefresh.remove(object);
    }else {
        cz.cvut.kbss.owlpersistence.owlapi.OWLAPIPersistenceConnector.LOG.warn((("Object not refreshed : " + object) + " because it is up-to-date."));
    }
}