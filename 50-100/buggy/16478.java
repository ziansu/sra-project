@mockit.Test
public void setStaticFinalFields() {
    if (!(JAVA9)) {
        setField(mockit.DeencapsulationTest.Subclass.class, "constantField", 54);
        setField(mockit.DeencapsulationTest.Subclass.class, "changed");
        setField(mockit.DeencapsulationTest.Subclass.class, true);
        assertEquals(54, getField(mockit.DeencapsulationTest.Subclass.class, "constantField"));
        assertEquals("changed", getField(mockit.DeencapsulationTest.Subclass.class, java.lang.String.class));
        assertTrue(getField(mockit.DeencapsulationTest.Subclass.class, boolean.class));
        assertFalse(mockit.DeencapsulationTest.Subclass.FLAG);
    }
}