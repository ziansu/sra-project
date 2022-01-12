public static gvlfm78.plugin.Hotels.Language getFromCode(java.lang.String code) {
    for (gvlfm78.plugin.Hotels.Language lang : gvlfm78.plugin.Hotels.Language.values()) {
        for (java.lang.String currentCode : lang.getCodes()) {
            if (currentCode.equalsIgnoreCase(code))
                return lang;
            
        }
    }
    return gvlfm78.plugin.Hotels.Language.Custom;
}