public void load() {
    langFolder = new java.io.File(HPS.getDataFolder(), "Locale");
    if (!(langFolder.exists())) {
        langFolder.mkdir();
    }
    this.registerLang(com.hpspells.core.Localisation.Language.ENGLISH, new java.io.File(langFolder, "us-english.properties"));
    this.registerLang(com.hpspells.core.Localisation.Language.DUTCH, new java.io.File(langFolder, "nl-dutch.properties"));
    if (loadDefaultLang())
        this.loadLang(com.hpspells.core.Localisation.Language.getLanuage(HPS.getConfig().getString("language")));
    
}