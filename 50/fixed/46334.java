@java.lang.Override
public void setSelectedEntity(java.util.List<org.sagebionetworks.repo.model.Reference> selected) {
    synAlert.clear();
    selectedEntity.clear();
    selectedEntity.addAll(selected);
}