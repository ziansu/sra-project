@org.junit.Before
public void setUp() throws java.lang.Exception {
    prefs = net.sf.jabref.preferences.JabRefPreferences.getInstance();
    net.sf.jabref.model.metadata.MetaData metaData = new net.sf.jabref.model.metadata.MetaData();
    context = new net.sf.jabref.model.database.BibDatabaseContext(new net.sf.jabref.model.database.BibDatabase(), metaData, new net.sf.jabref.model.Defaults());
    context.setDatabaseFile(testFolder.newFile("test.bib"));
    prefs.putBoolean(JabRefPreferences.BIB_LOC_AS_PRIMARY_DIR, true);
    entry = new net.sf.jabref.model.entry.BibEntry();
    entry.setCiteKey("Toot");
}