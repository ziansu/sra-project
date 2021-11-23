public boolean deleteByAlias(java.lang.String alias) {
    if (aliasExists(alias)) {
        synchronized(this) {
            for (org.tevya.model.LinkDefinition ld : currentLinkDefinitions.definitions) {
                if (ld.getAlias().equals(alias)) {
                    currentLinkDefinitions.definitions.remove(ld);
                    break;
                }
            }
            try {
                initialize();
            } catch (java.lang.Exception e) {
                org.tevya.repo.LinkDefinitionFlatFileRepository.logger.warning(java.lang.String.format("Reinitialization failed: %s", e));
            }
        }
        return true;
    }
    return false;
}