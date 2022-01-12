@java.lang.Override
protected void onCollisonWithStaticBox(com.dumbpug.nbp.NBPBox collidingBox, com.dumbpug.nbp.NBPIntersectionPoint originAtCollision) {
    if (((this.getVelx()) > (com.dumbpug.crossbowknight.C.ITEM_BOX_BOUNCE_SOUND_VELOCITY)) && ((this.getVely()) > (com.dumbpug.crossbowknight.C.ITEM_BOX_BOUNCE_SOUND_VELOCITY))) {
        com.dumbpug.crossbowknight.audio.Audio.getSoundEffect(Audio.SoundEffect.BLIP_HIGH).play();
    }
}