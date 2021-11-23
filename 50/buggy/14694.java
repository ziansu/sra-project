@java.lang.Override
public org.aksw.sparqlify.util.SqlBackendConfig apply(java.lang.String t) {
    org.aksw.sparqlify.util.SqlBackendConfig result = nameToConfig.get(t);
    return result;
}