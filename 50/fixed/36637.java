public void match(com.interrupt.doomtest.levels.Sector other) {
    floorHeight = other.floorHeight;
    ceilHeight = other.ceilHeight;
    floorMaterial.match(other.floorMaterial);
    ceilingMaterial.match(other.ceilingMaterial);
}