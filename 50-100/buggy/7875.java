@java.lang.SuppressWarnings(value = "static-method")
@org.junit.Test
public void testRotateY() {
    org.junit.Assert.assertEquals(Orientation16.S, Orientation16.SSE.rotate(Axis.Y, 1));
    org.junit.Assert.assertEquals(Orientation16.NW, Orientation16.N.rotate(Axis.Y, (-2)));
    org.junit.Assert.assertEquals(Orientation16.NW, Orientation16.SSW.rotate(Axis.Y, 5));
}