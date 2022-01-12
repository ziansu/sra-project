@org.junit.Before
public void initDwcaRepo() throws java.lang.Exception {
    iCfg = org.gbif.checklistbank.cli.importer.ImporterIT.CFG_MAPPER.readValue(com.google.common.io.Resources.getResource("cfg-importer.yaml"), org.gbif.checklistbank.cli.importer.ImporterConfiguration.class);
    iCfg.chunkMinSize = 10;
    iCfg.chunkSize = 50;
    iCfg.neo = cfg.neo;
    initGuice(iCfg, 1);
    try (java.sql.Connection con = hds.getConnection()) {
        try (java.sql.Statement st = con.createStatement()) {
            st.execute("TRUNCATE citation CASCADE");
            st.execute("TRUNCATE name CASCADE");
        }
    }
}