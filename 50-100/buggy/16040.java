public java.util.List<cz.cuni.mff.d3s.irm.model.runtime.api.IRMInstance> generateIRMInstances() {
    IRMinstances = new java.util.ArrayList<>();
    constructInstances(new java.util.HashMap<cz.cuni.mff.d3s.irm.model.design.Component, cz.cuni.mff.d3s.deeco.model.architecture.api.ComponentInstance>(), design.getComponents().listIterator(0));
    cz.cuni.mff.d3s.deeco.logging.Log.i("Removing all ensemble instances from architectural model.");
    architecture.getEnsembleInstances().retainAll(java.util.Collections.EMPTY_SET);
    return IRMinstances;
}