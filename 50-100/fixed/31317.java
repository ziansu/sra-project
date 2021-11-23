public void generateEnumMatchers(final java.io.OutputStream outputStream) throws java.io.IOException {
    if (com.spectralogic.ds3autogen.utils.ConverterUtil.isEmpty(spec.getTypes()))
        return ;
    
    for (final com.spectralogic.ds3autogen.api.models.Ds3Type ds3TypeEntry : spec.getTypes().values()) {
        final java.lang.Enum enumEntry = com.spectralogic.ds3autogen.c.converters.EnumConverter.toEnum(ds3TypeEntry);
        if (!(com.spectralogic.ds3autogen.utils.ConverterUtil.hasContent(enumEntry.getValues())))
            continue;
        
        processTemplate(enumEntry, "TypedefEnumMatcher.ftl", outputStream);
    }
}