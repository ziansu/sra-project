@org.junit.Before
public void setup() {
    javafx.scene.image.Image im = new javafx.scene.image.Image("/image/Spike.png");
    p1 = new doob.model.Spike(d1, d2, d3, im);
    b1 = new doob.model.Ball(220, 200, 30, 30, 30);
}