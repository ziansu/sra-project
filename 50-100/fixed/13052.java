public boolean deleteByKey(java.lang.String key) {
    if (keyExists(key)) {
        synchronized(this) {
            for (org.tevya.model.LinkDefinition ld : currentLinkDefinitions.definitions) {
                if (ld.getKey().equals(key)) {
                    currentLinkDefinitions.definitions.remove(ld);
                    break;
                }
            }
            try {
                update();
                initialize();
            } catch (java.lang.Exception e) {
                org.tevya.repo.LinkDefinitionFlatFileRepository.logger.warning(java.lang.String.format("Reinitialization failed: %s", e));
            }
        }
        return true;
    }
    return false;
}