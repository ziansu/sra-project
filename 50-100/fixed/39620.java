@databaseModuleTester.Test
public void testPopTree() {
    databaseModule.DirTree tree = databaseModule.DbFunctions.popTree();
    java.util.Iterator<java.lang.String> iter = driver.SQLiteManager.getDistinct("path", null).iterator();
    int size = tree.getSize();
    while (iter.hasNext()) {
        assertTrue(tree.hasKey(iter.next()));
        size--;
    } 
    assertEquals(size, 0);
}