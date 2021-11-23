public void setup() {
    this.size(800, 500);
    this.smooth();
    this.frameRate(30);
    ball = new Ball(400, 250);
    lPaddle = new LeftPaddle(60, ((height) / 2));
    rPaddle = new RightPaddle(740, ((height) / 2));
    mLine = new MidLine();
}