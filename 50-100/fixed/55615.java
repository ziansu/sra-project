@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent evt) {
    try {
        allocatableEdit.mapToObjects();
        java.util.List<org.rapla.entities.domain.Allocatable> objects = allocatableEdit.getObjects();
        toStore.addAll(objects);
    } catch (org.rapla.framework.RaplaException e) {
        getLogger().error(e.getMessage(), e);
    }
}