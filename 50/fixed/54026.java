@org.junit.Test
public void testEqualsDifferentClass() {
    datastructures.Attribute a = new datastructures.Attribute("A");
    assertFalse(mainAttributeJoint.equals(a));
}