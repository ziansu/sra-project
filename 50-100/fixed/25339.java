@java.lang.Override
public void draw(processing.core.PApplet p) {
    p.pushMatrix();
    p.translate(getNum1().getNumber().getValue(), getNum2().getNumber().getValue());
    getPic().draw(p);
    p.popMatrix();
}