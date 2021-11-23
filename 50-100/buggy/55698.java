protected java.util.Map<java.lang.String, java.lang.Object> parseAsDedupRecord(cz.mzk.recordmanager.server.model.HarvestedRecord record) {
    java.io.InputStream is = new java.io.ByteArrayInputStream(record.getRawRecord());
    cz.mzk.recordmanager.server.marc.MarcRecord rec = marcXmlParser.parseRecord(is);
    cz.mzk.recordmanager.server.scripting.MappingScript<cz.mzk.recordmanager.server.marc.MarcRecord> script = getMappingScript(record);
    return script.parse(rec);
}