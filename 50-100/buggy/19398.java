@org.junit.AfterClass
public static void cleanup() {
    if (!(UtilsImplementationsTest.PackingTest.CLEAN_ALL)) {
        java.io.File zipfileToDelete = new java.io.File(UtilsImplementationsTest.PackingTest.zipfileToPackPath);
        zipfileToDelete.delete();
        return ;
    }
    java.io.File unpackedFolder = new java.io.File(UtilsImplementationsTest.PackingTest.unpackDirPath);
    for (java.io.File file : unpackedFolder.listFiles())
        file.delete();
    
}