@java.lang.Override
void initNeo(org.gbif.checklistbank.nub.source.NeoUsageWriter writer) throws java.lang.Exception {
    try (java.sql.Connection c = clb.connect()) {
        final org.postgresql.copy.CopyManager cm = new org.postgresql.copy.CopyManager(((org.postgresql.core.BaseConnection) (c)));
        cm.copyOut((((("COPY (" + (("SELECT usage.id, usage.parent_fk, usage.basionym_fk, usage.rank, usage.is_synonym, usage.status, usage.nom_status, node.scientific_name" + " FROM name_usage usage join name node ON name_fk=node.id") + " WHERE dataset_key = '")) + (source.key)) + "')") + " TO STDOUT WITH NULL ''"), writer);
        org.gbif.checklistbank.nub.source.ClbUsageIteratorNeo.LOG.info("Loaded nub source data {} with {} usages into neo4j", source.name, writer.getCounter());
    }
}