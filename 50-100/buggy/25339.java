@java.lang.Override
public void draw(processing.core.PApplet p) {
    p.translate(getNum1().getNumber().getValue(), getNum2().getNumber().getValue());
    p.pushMatrix();
    getPic().draw(p);
    p.popMatrix();
}