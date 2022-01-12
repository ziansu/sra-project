public void registerModel(com.jme3.scene.Spatial spatial) {
    amara.engine.applications.ingame.client.models.AnimControl animationControl = spatial.getControl(amara.engine.applications.ingame.client.models.AnimControl.class);
    if (animationControl != null) {
        animationControl.addListener(this);
        amara.engine.applications.ingame.client.models.AnimChannel animationChannel = copyAnimation(spatial);
        animationChannels.add(animationChannel);
    }
    amara.engine.applications.ingame.client.models.SkeletonControl skeletonControl = spatial.getControl(amara.engine.applications.ingame.client.models.SkeletonControl.class);
    if (skeletonControl != null) {
        skeletonControl.setHardwareSkinningPreferred(amara.engine.settings.Settings.getBoolean("hardware_skinning"));
    }
}