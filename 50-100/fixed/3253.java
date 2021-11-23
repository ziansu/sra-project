@org.junit.Test
public void testCanAddMultipleXAttrToSameFile() throws java.io.IOException {
    org.apache.giraffa.TestXAttr.grfs.setXAttr(path1, attrName1, attrValue1);
    org.apache.giraffa.TestXAttr.grfs.setXAttr(path1, attrName2, attrValue2);
    java.util.List<java.lang.String> listOfXAttrNames = org.apache.giraffa.TestXAttr.grfs.listXAttrs(path1);
    org.junit.Assert.assertEquals(2, listOfXAttrNames.size());
    org.junit.Assert.assertTrue(listOfXAttrNames.contains(attrName1));
    org.junit.Assert.assertTrue(listOfXAttrNames.contains(attrName2));
}