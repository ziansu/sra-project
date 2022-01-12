@java.lang.Override
public void initialise() {
    sceneOpaqueFbo = displayResolutionDependentFBOs.get(org.terasology.rendering.opengl.fbms.DisplayResolutionDependentFBOs.READONLY_GBUFFER);
    refractiveReflectiveFbo = displayResolutionDependentFBOs.get(org.terasology.rendering.dag.nodes.RefractiveReflectiveBlocksNode.REFRACTIVE_REFLECTIVE);
    playerCamera = worldRenderer.getActiveCamera();
    addDesiredStateChange(new org.terasology.rendering.dag.stateChanges.LookThrough(playerCamera));
    requiresFBO(new org.terasology.rendering.opengl.FBOConfig(org.terasology.rendering.dag.nodes.RefractiveReflectiveBlocksNode.REFRACTIVE_REFLECTIVE, org.terasology.rendering.opengl.ScalingFactors.FULL_SCALE, FBO.Type.HDR).useNormalBuffer(), displayResolutionDependentFBOs);
    addDesiredStateChange(new org.terasology.rendering.dag.stateChanges.BindFBO(org.terasology.rendering.dag.nodes.RefractiveReflectiveBlocksNode.REFRACTIVE_REFLECTIVE, displayResolutionDependentFBOs));
    displayResolutionDependentFBOs.subscribe(this);
    addDesiredStateChange(new org.terasology.rendering.dag.stateChanges.EnableMaterial(org.terasology.rendering.dag.nodes.RefractiveReflectiveBlocksNode.CHUNK_SHADER.toString()));
    chunkShader = getMaterial(org.terasology.rendering.dag.nodes.RefractiveReflectiveBlocksNode.CHUNK_SHADER);
}