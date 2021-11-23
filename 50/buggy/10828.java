@org.junit.Test
public void reflectOn1() throws java.lang.Exception {
    de.beuth.cg1.dogeraytracer.vecmatlib.Vector3 resV = v7.reflectOn(n2);
    assertEquals(new de.beuth.cg1.dogeraytracer.vecmatlib.Vector3(0.707, 0.707, (-0.0)), resV);
}