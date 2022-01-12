public void hit(int damage) {
    this.armor -= damage;
    if ((this.armor) <= 0) {
        this.health -= damage;
        if ((this.health) <= 0) {
            if (explode) {
                sun.audio.AudioPlayer.player.start(audio.AudioAssets.getExplosionAudio());
                explode = false;
            }
            this.isExploding = true;
            this.count = 0;
        }
    }
}