@java.lang.Override
protected ch.fhnw.ether.scene.mesh.material.ColorMaterial getColorAsMaterial(java.lang.Enum biome) {
    java.lang.System.out.printf("biome: %s material: %s \n", biome, ((controller.generation.VoronoiGraphFor2D.ColorData) (biome)).color);
    return ((controller.generation.VoronoiGraphFor2D.ColorData) (biome)).color;
}