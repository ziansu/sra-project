private void makeCollector(eu.etaxonomy.cdm.io.salvador.SalvadorSpecimenImportState state, int collectorNo, eu.etaxonomy.cdm.model.agent.Team team, java.util.Map<java.lang.String, java.lang.String> record, int row) {
    java.lang.String str = record.get(("COLLECTOR_" + collectorNo));
    if (str == null) {
        return ;
    }else {
        parsePerson(state, str, team, row);
    }
    return ;
}