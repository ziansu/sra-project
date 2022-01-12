private void mergeLanguageMap(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> tenMinLanguageMap) {
    for (java.lang.String languageName : tenMinLanguageMap.keySet()) {
        if (languageMap.containsKey(languageName)) {
            int languageRepeatedInThisHour = languageMap.get(languageName);
            int languageRepeatedInTenMins = tenMinLanguageMap.get(languageName);
            languageMap.put(languageName, (languageRepeatedInTenMins + languageRepeatedInThisHour));
        }
    }
}