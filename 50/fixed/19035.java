protected static com.orientechnologies.orient.core.record.impl.ODocument createSimplePropertyDoc(java.lang.String key, java.lang.String value) {
    com.orientechnologies.orient.core.record.impl.ODocument pDoc = new com.orientechnologies.orient.core.record.impl.ODocument(org.ndexbio.common.NdexClasses.SimpleProperty).fields(NdexClasses.SimpleProp_P_name, key, NdexClasses.SimpleProp_P_value, value).save();
    return pDoc;
}