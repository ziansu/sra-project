public void setOntologyNetwork(edu.umich.med.mbni.lkq.cyontology.internal.model.OntologyNetwork newOntologyNetwork) {
    curOntologyNetwork = newOntologyNetwork;
    edu.umich.med.mbni.lkq.cyontology.internal.event.OntologyNetworkChangedEvent event = new edu.umich.med.mbni.lkq.cyontology.internal.event.OntologyNetworkChangedEvent(this, curOntologyNetwork, newOntologyNetwork);
    fireOntologyNetworkChangedEvent(event);
}