@java.lang.Override
public java.util.List<pt.uc.dei.aor.pf.entities.PositionEntity> findPositionsByLocationsAll(java.util.List<java.lang.String> locations) {
    pt.uc.dei.aor.pf.beans.PositionEJBImp.log.info("Finding positions by locations");
    return positionDAO.findPositionsByLocationsAll(locations);
}