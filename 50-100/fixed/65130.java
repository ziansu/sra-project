private void setFixtureDef() {
    org.academiadecodigo.hackaton.pang.sprites.FixtureDef fdef = new org.academiadecodigo.hackaton.pang.sprites.FixtureDef();
    org.academiadecodigo.hackaton.pang.sprites.CircleShape shape = new org.academiadecodigo.hackaton.pang.sprites.CircleShape();
    shape.setRadius(((org.academiadecodigo.hackaton.pang.PangGame.BALL_RADIUS) / (org.academiadecodigo.hackaton.pang.PangGame.PPM)));
    fdef.shape = shape;
    fdef.restitution = 1.0F;
    fdef.friction = 0.0F;
    fixture = body.createFixture(fdef);
    fixture.setUserData(this);
}