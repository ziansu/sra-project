@org.testng.annotations.Test(dataProvider = "getTree")
public void contains(int testCaseNumber, com.googlecode.jctree.BinarySearchTree<java.lang.String> tree) {
    org.testng.Assert.assertEquals(false, tree.contains(null));
    org.testng.Assert.assertEquals(false, tree.contains("Not present"));
    org.testng.Assert.assertEquals(false, tree.contains(new java.util.ArrayList<java.lang.Object>()));
    for (java.lang.String i : tree)
        org.testng.Assert.assertEquals(true, tree.contains(i));
    
}