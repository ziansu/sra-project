private java.util.List<org.verapdf.model.xmplayer.XMPSchema> getSchemas() {
    java.util.List<org.verapdf.model.xmplayer.XMPSchema> resultSchemas = new java.util.ArrayList<>();
    for (org.verapdf.model.xmplayer.XMPSchema pbschema : xmpMetadata.getAllSchemas()) {
        org.verapdf.model.xmplayer.XMPSchema schema = org.verapdf.model.factory.xmp.PBSchemaFactory.createSchema(pbschema);
        resultSchemas.add(schema);
    }
    return resultSchemas;
}