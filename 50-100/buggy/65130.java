private void setFixtureDef() {
    org.academiadecodigo.hackaton.pang.sprites.FixtureDef fdef = new org.academiadecodigo.hackaton.pang.sprites.FixtureDef();
    org.academiadecodigo.hackaton.pang.sprites.CircleShape shape = new org.academiadecodigo.hackaton.pang.sprites.CircleShape();
    shape.setRadius(((org.academiadecodigo.hackaton.pang.PangGame.BALL_RADIUS) / (org.academiadecodigo.hackaton.pang.PangGame.PPM)));
    fdef.filter.categoryBits = org.academiadecodigo.hackaton.pang.PangGame.BALL_BIT;
    fdef.filter.maskBits = ((org.academiadecodigo.hackaton.pang.PangGame.BLOCK_BIT) | (org.academiadecodigo.hackaton.pang.PangGame.EDGE_BIT)) | (org.academiadecodigo.hackaton.pang.PangGame.PADDLE_BIT);
    fdef.shape = shape;
    fdef.restitution = 1.0F;
    fdef.friction = 0.0F;
    fixture = body.createFixture(fdef);
    fixture.setUserData(this);
}