@java.lang.Override
public void handleResponse(E newEntity) {
    weborb.writer.MessageWriter.setObjectSubstitutor(null);
    com.backendless.FootprintsManager.getInstance().Inner.duplicateFootprintForObject(serializedEntity, newEntity, entity);
    com.backendless.Footprint footprint = com.backendless.FootprintsManager.getInstance().getEntityFootprint(newEntity);
    if (footprint != null)
        footprint.initObjectId(entity);
    
    if (responder != null)
        responder.handleResponse(newEntity);
    
}