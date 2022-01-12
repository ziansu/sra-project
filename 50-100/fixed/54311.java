private void findCreatorAndCreateBusMapping(hu.bme.mit.massif.simulink.BusSelector selector) {
    hu.bme.mit.massif.simulink.api.util.bus.BusSignalMappingCreator.SpecifiableOriginatingOutPort origin = findBusCreatorOfIncomigBus(selector);
    if (origin != null) {
        if ((origin.specification) == null) {
            handleIncompleteMappings(origin.outPort, selector.getMappings());
        }else {
            createBusMappingUsingCreator(selector, origin.specification);
        }
    }
    mapper.logDebug("Created bus mapping for %s", mapper.getFQNOrEmpty(selector));
}