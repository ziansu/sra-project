public boolean isInstalled(com.constellio.model.entities.modules.Module module) {
    for (com.constellio.model.entities.modules.Module anInstalledModule : getInstalledModules()) {
        if (anInstalledModule.getId().equals(module.getId())) {
            return true;
        }
    }
    return false;
}