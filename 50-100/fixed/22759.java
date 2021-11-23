public static uk.ac.ebi.pride.tools.mztab_exporter.exporter.util.SearchEngineParameter getParam(java.lang.String searchEngineName) {
    if (searchEngineName == null) {
        return null;
    }
    searchEngineName = searchEngineName.toLowerCase();
    for (uk.ac.ebi.pride.tools.mztab_exporter.exporter.util.SearchEngineParameter p : uk.ac.ebi.pride.tools.mztab_exporter.exporter.util.SearchEngineParameter.values()) {
        if (searchEngineName.contains(p.getExpectedName()))
            return p;
        
    }
    return null;
}