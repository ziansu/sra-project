public java.util.List<it.emarolab.amor.owlInterface.OWLOntologyChange> convertSuperClassesToEquivalentClass(java.lang.String className) {
    java.util.List<java.util.concurrent.locks.Lock> mutexes = getMutexes(mutexReasoner, mutexConvertEquivalentClass);
    return new it.emarolab.amor.owlInterface.OWLReferences.OWLReferencesCaller<java.util.List<it.emarolab.amor.owlInterface.OWLOntologyChange>>(mutexes, this) {
        @java.lang.Override
        protected java.util.List<it.emarolab.amor.owlInterface.OWLOntologyChange> performSynchronisedCall() {
            return getManipulator().convertSuperClassesToEquivalentClass(className);
        }
    }.call();
}