public static void assertParentChildRelationship(backend.CategoryNode parent, java.lang.String parentName, backend.CategoryNode child, java.lang.String childName) {
    assertTrue((((childName + " is not ") + parentName) + "'s child"), backend.Helper.isChild(child, parent));
    assertSame((((parentName + " is not ") + child) + "'s parent"), parent, child.getParent());
}