@org.junit.Test
public void testEqualsAttributeJointNullTrue() {
    datastructures.AttributeJoint A = new datastructures.AttributeJoint();
    datastructures.AttributeJoint B = new datastructures.AttributeJoint();
    assertTrue(A.equals(B));
}