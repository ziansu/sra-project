public static void assertNoParentChildRelationship(backend.CategoryNode parent, java.lang.String parentName, backend.CategoryNode child, java.lang.String childName) {
    assertFalse((((childName + " is ") + parentName) + "'s child"), backend.Helper.isChild(child, parent));
    assertNotSame((((parentName + " is ") + childName) + "'s parent"), parent, child.getParent());
}