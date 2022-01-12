private void mergeLanguageMap(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> tenMinLanguageMap) {
    for (java.lang.String languageName : tenMinLanguageMap.keySet()) {
        int languageRepeatedInThisHour = 0;
        int languageRepeatedInTenMins;
        if (languageMap.containsKey(languageName)) {
            languageRepeatedInThisHour = languageMap.get(languageName);
        }
        languageRepeatedInTenMins = tenMinLanguageMap.get(languageName);
        languageMap.put(languageName, (languageRepeatedInTenMins + languageRepeatedInThisHour));
    }
}