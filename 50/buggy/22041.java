@org.testng.annotations.Test
public void testEqualsNullSafe() {
    assertFalse(new nut.model.Goal().equals(null));
}