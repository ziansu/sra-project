@org.junit.Test
public void testBask() throws java.lang.Exception {
    serialise("/acnet2/bask.cell.nml", "./src/test/resources/baskAllTypes.xmi", "bask", true);
    serialise("/acnet2/bask.cell.nml", "./src/test/resources/baskAllTypes.xmi", null, true);
    serialise("/acnet2/bask.cell.nml", "./src/test/resources/baskAllTypes.json", "bask", true);
}