public fr.inria.soctrace.lib.model.EventProducer createLeaveEventProd(int parentId, fr.inria.soctrace.lib.utils.IdManager producerIdManager, fr.inria.soctrace.lib.storage.TraceDBObject traceDB) throws fr.inria.soctrace.lib.model.utils.SoCTraceException {
    fr.inria.soctrace.lib.model.EventProducer ep = new fr.inria.soctrace.lib.model.EventProducer(producerIdManager.getNextId());
    ep.setName(((fr.inria.soctrace.tools.tracegenerator.TraceGenerator.PRODUCER_NAME_PREFIX) + (ep.getId())));
    ep.setType(fr.inria.soctrace.tools.tracegenerator.TraceGenerator.NORMAL_PRODUCER_TYPE);
    ep.setLocalId(((fr.inria.soctrace.tools.tracegenerator.TraceGenerator.PRODUCER_LOCAL_ID_PREFIX) + (ep.getId())));
    ep.setParentId(parentId);
    producers.add(ep);
    traceDB.save(ep);
    return ep;
}