@org.junit.Test
public void testEquals() throws java.lang.Exception {
    model.data.CombinedDataTable comb = new model.data.CombinedDataTable(dataTables.get(1), dataTables.get(0), dataTables.get(2));
    model.data.CombinedDataTable copy = new model.data.CombinedDataTable(dataTables.get(1), dataTables.get(0), dataTables.get(2));
    assertTrue(comb.equals(copy));
}