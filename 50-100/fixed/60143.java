public void selectAllocatables(java.util.Collection<org.rapla.entities.domain.Allocatable> allocatables) {
    selectedAllocatables.clear();
    if (allocatables != null) {
        java.util.List<org.rapla.entities.domain.Allocatable> list = new java.util.ArrayList<org.rapla.entities.domain.Allocatable>(allocatables);
        java.util.Collections.sort(list, new org.rapla.entities.NamedComparator<org.rapla.entities.domain.Allocatable>(getRaplaLocale().getLocale()));
        selectedAllocatables.addAll(new java.util.HashSet<org.rapla.entities.domain.Allocatable>(list));
    }
    createColorMap();
}