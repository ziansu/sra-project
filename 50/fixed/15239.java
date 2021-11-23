@main.capacitytracker.AfterClass
public static void tearDownClass() {
    java.io.File f = new java.io.File(main.capacitytracker.DataStoreWriterTest.dataStorePath, "datastore.csv");
    f.delete();
}