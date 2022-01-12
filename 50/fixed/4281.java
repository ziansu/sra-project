public void setBroken() {
    if (!(broken)) {
        broken = true;
        this.setImage(new com.badlogic.gdx.graphics.Texture(Gdx.files.internal("hole2.png")));
    }
}