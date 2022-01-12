public void generateStructFreeFunctions(final java.io.OutputStream outputStream) throws java.io.IOException, java.text.ParseException {
    if (!(com.spectralogic.ds3autogen.utils.ConverterUtil.hasContent(spec.getTypes())))
        return ;
    
    for (final com.spectralogic.ds3autogen.api.models.Ds3Type ds3TypeEntry : spec.getTypes().values()) {
        final com.spectralogic.ds3autogen.c.models.Struct structEntry = com.spectralogic.ds3autogen.c.converters.StructConverter.toStruct(ds3TypeEntry);
        if (!(com.spectralogic.ds3autogen.utils.ConverterUtil.hasContent(structEntry.getVariables())))
            continue;
        
        processTemplate(structEntry, "FreeStruct.ftl", outputStream);
    }
}