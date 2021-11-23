@java.lang.Override
public void setStitchedSprites(thebetweenlands.client.handler.TextureStitchHandler.Frame[][] frames) {
    if (((this.animation) != null) && (frames != null)) {
        this.animation.setFrames(frames[0]);
        if ((this.particleTexture) == null) {
            this.setParticleTexture(frames[0][0].getSprite());
        }
    }
}