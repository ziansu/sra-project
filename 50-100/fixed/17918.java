public void earthGrabSelf() {
    closestEntity = player;
    groundBlock = getGround();
    if ((groundBlock) == null)
        return ;
    
    ParticleEffect.BLOCK_CRACK.display(((com.projectkorra.projectkorra.util.ParticleEffect.ParticleData) (new com.projectkorra.projectkorra.util.ParticleEffect.BlockData(blockType, blockByte))), 1.0F, 1.0F, 1.0F, 0.1F, 100, player.getLocation(), 500);
    formDome();
}