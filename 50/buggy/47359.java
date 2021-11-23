@org.junit.Test
public void testBadCast() {
    expectedExit = 0;
    helpTF("escBadCast", "-show", "-method=BadCast.equals");
}