@org.junit.Test
public void testCommand() {
    org.geogebra.io.latex.SerializeLaTeX.checkCannon("turtle1=Turtle[]", "turtle1=Turtle[]");
    org.geogebra.io.latex.SerializeLaTeX.checkCannon("Turtle[]", "Turtle[]");
    org.geogebra.io.latex.SerializeLaTeX.checkCannon("Turtle[1*3,7]", "Turtle[1*3,7]");
}