@java.lang.Override
public void draw(processing.core.PApplet p) {
    p.noFill();
    p.rect(0, 0, treelang.TStorage.gI().get(this.args[0]).getNumber().getValue(), treelang.TStorage.gI().get(this.args[1]).getNumber().getValue());
}