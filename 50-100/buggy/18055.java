public void setup() {
    box2d = new shiffman.box2d.Box2DProcessing(this);
    box2d.createWorld();
    hand = new springsim.Hand(this, 300, 300);
    s1 = new springsim.Spring(100, 100, 40, 200, this, box2d);
    s1.bind(hand.getX(), hand.getY(), hand);
    sc = new springsim.SpringCollection();
    size(1000, 800);
    background(100, 100, 100);
}