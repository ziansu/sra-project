private org.isotc211.x2005.gco.CharacterStringPropertyType[] listToCharacterStringPropertyTypeArray(java.util.List<java.lang.String> list) {
    return list.stream().map(( string) -> {
        org.isotc211.x2005.gco.CharacterStringPropertyType cspt = CharacterStringPropertyType.Factory.newInstance();
        cspt.setCharacterString(string);
        return string;
    }).toArray(org.isotc211.x2005.gco.CharacterStringPropertyType[]::new);
}