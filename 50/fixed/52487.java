@java.lang.Override
protected ch.fhnw.ether.scene.mesh.material.ColorMaterial getColorAsMaterial(java.lang.Enum biome) {
    return ((controller.generation.VoronoiGraphFor2D.ColorData) (biome)).color;
}