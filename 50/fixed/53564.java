@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public void testgetSingleElement_WithoutInput() {
    edu.ucdenver.ccp.common.collections.CollectionsUtil.getSingleElement(edu.ucdenver.ccp.common.collections.CollectionsUtil.createList());
}