public void generateTypedefStructs(final java.io.OutputStream outputStream) throws java.io.IOException, java.text.ParseException {
    for (final com.spectralogic.ds3autogen.api.models.Ds3Type ds3TypeEntry : spec.getTypes().values()) {
        if (!(com.spectralogic.ds3autogen.utils.ConverterUtil.hasContent(ds3TypeEntry.getElements())))
            continue;
        
        final com.spectralogic.ds3autogen.c.models.Struct structEntry = com.spectralogic.ds3autogen.c.converters.StructConverter.toStruct(ds3TypeEntry);
        processTemplate(structEntry, "TypedefStruct.ftl", outputStream);
    }
}