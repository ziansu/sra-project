public static java.lang.String getMappingByName(java.lang.String name) {
    if ((com.petpet.c3po.utils.ContentTypeMapping.TERMS) == null)
        com.petpet.c3po.utils.ContentTypeMapping.init();
    
    final java.lang.String prop = ((java.lang.String) (com.petpet.c3po.utils.ContentTypeMapping.TERMS.get(name)));
    if (prop != null)
        return prop;
    
    return null;
}