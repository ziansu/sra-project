@org.junit.Before
public void setUp_RestructureSaveCommandTest() throws java.lang.Exception {
    context = getContext();
    wiki = getWikiMock();
    restrSaveCmd = new com.celements.navigation.cmd.ReorderSaveHandler(context);
}