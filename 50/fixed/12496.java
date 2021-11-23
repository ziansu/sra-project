public void createOrUpdate(de.fhws.campusapp.entity.Module module) {
    de.fhws.campusapp.entity.Module existingModule = readModule(module.getLvid());
    if (existingModule != null) {
        updateModuleVisited(module);
    }else {
        createNewModule(module);
    }
}