@java.lang.Override
public java.util.List<pt.uc.dei.aor.project.business.model.IPosition> getIPositions() {
    return positionPersistence.findAllPositions();
}