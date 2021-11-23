public void addAdditionalValue(java.lang.String name) {
    for (eu.transkribus.languageresources.dictionaries.EntryValue entry : additionalValues) {
        if (entry.getName().equals(name)) {
            entry.increaseFrequency();
            return ;
        }
    }
    eu.transkribus.languageresources.dictionaries.EntryValue entry = new eu.transkribus.languageresources.dictionaries.EntryValue(name);
    additionalValues.add(entry);
}