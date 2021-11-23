@org.junit.AfterClass
public static void cleanup() {
    if (!(UtilsImplementationsTest.PackingTest.CLEAN_ALL)) {
        java.io.File zipfileToDelete = new java.io.File(UtilsImplementationsTest.PackingTest.zipfileToPackPath);
        zipfileToDelete.delete();
        return ;
    }
    for (java.io.File file : new java.io.File(UtilsImplementationsTest.PackingTest.unpackDirPath).listFiles())
        file.delete();
    
}