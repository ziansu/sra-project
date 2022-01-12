private edu.cmu.emfta.Event createEvent(org.osate.aadl2.instance.ComponentInstance component, org.osate.aadl2.NamedElement namedElement, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet typeSet, boolean putInCache) {
    edu.cmu.emfta.Event newEvent = EmftaFactory.eINSTANCE.createEvent();
    java.lang.String name = buildName(component, namedElement, typeSet);
    java.lang.String identifier = buildIdentifier(component, namedElement, typeSet);
    emftaModel.getEvents().add(newEvent);
    newEvent.setName(name);
    newEvent.setGate(null);
    if (putInCache) {
        cache.put(identifier, newEvent);
    }
    return newEvent;
}