@org.junit.Test
public void testCanAddAttrWithCreateFlagOnly() throws java.io.IOException {
    org.apache.giraffa.TestXAttr.grfs.setXAttr(path1, attrName1, attrValue2, java.util.EnumSet.of(XAttrSetFlag.CREATE));
    java.util.List<java.lang.String> listOfXAttrNames = org.apache.giraffa.TestXAttr.grfs.listXAttrs(path1);
    org.junit.Assert.assertEquals(1, listOfXAttrNames.size());
}