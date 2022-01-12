private void loadLang() {
    langFile = new java.io.File(baseDir, (((prefix) + (language)) + ".yml"));
    if (!(langFile.exists())) {
        extractLangFile();
    }
    try {
        lang = new at.pcgamingfreaks.yaml.YAML(langFile);
        updateLang();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}