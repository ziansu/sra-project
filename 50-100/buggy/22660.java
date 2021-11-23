public java.lang.String findNamedEntityTag(java.lang.String word) {
    java.lang.String tag = ananya.utils.gazetteer.Gazetteer.NE_OTHER;
    java.lang.String fixedText = vowelFixer.fixText(word, true);
    if (personNamesMap.containsKey(fixedText)) {
        tag = ananya.utils.gazetteer.Gazetteer.NE_PERSON;
    }else
        if (locationNamesMap.containsKey(fixedText)) {
            tag = ananya.utils.gazetteer.Gazetteer.NE_LOCATION;
        }else
            if (organizationNamedMap.containsKey(fixedText)) {
                tag = ananya.utils.gazetteer.Gazetteer.NE_ORGANIZATION;
            }
        
    
    return tag;
}