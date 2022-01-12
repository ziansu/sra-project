@org.junit.Test
public void testEqualsFalseDifferentClassObjects() {
    assertFalse(keyJoint.equals(new java.lang.String()));
}