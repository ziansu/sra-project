private edu.cmu.emfta.Event createEvent(org.osate.aadl2.instance.ComponentInstance component, org.osate.aadl2.NamedElement namedElement, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet typeSet, boolean putInCache) {
    edu.cmu.emfta.Event newEvent = EmftaFactory.eINSTANCE.createEvent();
    java.lang.String identifier = buildIdentifier(component, namedElement, typeSet);
    emftaModel.getEvents().add(newEvent);
    newEvent.setName(identifier);
    newEvent.setGate(null);
    eventIdentifier = (eventIdentifier) + 1;
    if (putInCache) {
        cache.put(buildName(component, namedElement, typeSet), newEvent);
    }
    return newEvent;
}