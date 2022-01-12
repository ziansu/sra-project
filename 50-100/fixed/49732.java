public void resolvePaddleCollision(Paddle paddle) {
    Rectangle rec = paddle.getRectangle();
    double dxSigned = (rec.getXPosition()) - (this.position[0]);
    double dySigned = (rec.getYPosition()) - (this.position[1]);
    if ((java.lang.Math.signum(velocity[1])) == (java.lang.Math.signum(dySigned))) {
        this.velocity[1] *= -1;
    }
}