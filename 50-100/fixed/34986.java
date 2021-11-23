public it.emarolab.amor.owlInterface.OWLOntologyChange addClass(java.lang.String className) {
    java.util.List<java.util.concurrent.locks.Lock> mutexes = getMutexes(mutexReasoner, mutexAddClass);
    return new it.emarolab.amor.owlInterface.OWLReferences.OWLReferencesCaller<it.emarolab.amor.owlInterface.OWLOntologyChange>(mutexes, this) {
        @java.lang.Override
        protected it.emarolab.amor.owlInterface.OWLOntologyChange performSynchronisedCall() {
            return getManipulator().addClass(className);
        }
    }.call();
}