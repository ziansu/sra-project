public it.finsoft.entity.Settings find() {
    it.finsoft.entity.Settings instance = em.find(it.finsoft.entity.Settings.class, new java.lang.Long(1L));
    if (instance == null)
        it.finsoft.manager.SettingsManager.LOG.error("Record SETTINGS non trovato!? N.B. deve avere ID=1.");
    
    return instance;
}