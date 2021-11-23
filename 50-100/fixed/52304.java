@org.junit.Test
public void rref() throws java.lang.Exception {
    assertEquals(new main.Matrix(new main.Vector[]{ new main.Vector(1, 0, 0) , new main.Vector(0, 1, 0) , new main.Vector(0, 0, 1) }), M.rref());
}