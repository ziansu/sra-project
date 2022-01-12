private java.util.List<thaumcraft.codechicken.lib.vec.BlockCoord> getBlackListNBT(int[] coords) {
    java.util.List<thaumcraft.codechicken.lib.vec.BlockCoord> filled = new java.util.ArrayList<thaumcraft.codechicken.lib.vec.BlockCoord>();
    for (int i = coords.length; i > 0; i -= 3) {
        int xcount = i - 2;
        int ycount = i - 1;
        int zcount = i;
        filled.add(new thaumcraft.codechicken.lib.vec.BlockCoord(xcount, ycount, zcount));
    }
    return filled;
}