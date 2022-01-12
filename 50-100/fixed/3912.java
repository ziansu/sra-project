private java.util.List<org.verapdf.model.xmplayer.XMPSchema> getSchemas() {
    java.util.List<org.verapdf.model.xmplayer.XMPSchema> resultSchemas = new java.util.ArrayList<>();
    if (((xmpMetadata) != null) && ((xmpMetadata.getAllSchemas()) != null)) {
        for (org.verapdf.model.xmplayer.XMPSchema pbschema : xmpMetadata.getAllSchemas()) {
            if (pbschema != null) {
                org.verapdf.model.xmplayer.XMPSchema schema = org.verapdf.model.factory.xmp.PBSchemaFactory.createSchema(pbschema);
                resultSchemas.add(schema);
            }
        }
    }
    return resultSchemas;
}