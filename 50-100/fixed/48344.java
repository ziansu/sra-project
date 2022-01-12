@org.junit.Test
public void testHeightRecklessBus() {
    java.lang.System.out.println("Height of a reckless bus");
    trafficsimulator.core.Lane lane = new trafficsimulator.core.Lane(Lane.Direction.IDENTICAL);
    trafficsimulator.core.Vehicle recklessBus = new trafficsimulator.core.RecklessBus();
    trafficsimulator.utils.Size expResult = new trafficsimulator.utils.Size(20, 10);
    trafficsimulator.utils.Size result = recklessBus.getSize();
    assertEquals(expResult.height, result.height, 0.001);
}