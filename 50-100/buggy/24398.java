public java.lang.String getPosition(legends.model.HistoricalFigure hf) {
    legends.model.Entity e = legends.model.World.getEntity(entityId);
    legends.model.EntityPositionAssignment a = e.getAssignment(positionProfileId);
    legends.model.EntityPosition p = e.getPosition(a.getPositionId());
    if (p == null)
        return "" + (positionProfileId);
    
    return p.getName();
}