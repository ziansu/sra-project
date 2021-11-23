@org.junit.Test
@org.jvnet.hudson.test.Issue(value = "JENKINS-2995")
public void testJunctionIsRemovedButNotContents() throws java.lang.Exception {
    java.io.File subdir1 = tmp.newFolder("notJunction");
    java.io.File f1 = new java.io.File(subdir1, "testfile1.txt");
    org.junit.Assert.assertTrue("Unable to create temporary file in notJunction directory", f1.createNewFile());
    java.io.File j1 = makeJunction(tmp.getRoot(), subdir1);
    hudson.Util.deleteRecursive(j1);
    org.junit.Assert.assertFalse("Windows Junction should have been removed", j1.exists());
    org.junit.Assert.assertTrue("Contents of Windows Junction should not be removed", f1.exists());
}