protected java.util.ArrayList<com.ibm.ets.ita.ce.store.model.CeConcept> getConceptsWithNameStarting(java.lang.String pConName) {
    return this.ac.getIndexedEntityAccessor().calculateConceptsWithNameStarting((pConName + " "));
}