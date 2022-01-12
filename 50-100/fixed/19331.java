public java.util.Collection<com.jplee.worldmanager.util.Replaceable> getReplaceables(int world, net.minecraft.block.Block block) {
    java.util.List<com.jplee.worldmanager.util.Replaceable> rep = com.google.common.collect.Lists.newArrayList();
    if ((sortedReplaceables.get(com.jplee.worldmanager.gen.WorldGeneration.ANY_DIMENSION)) != null) {
        rep.addAll(sortedReplaceables.get(com.jplee.worldmanager.gen.WorldGeneration.ANY_DIMENSION).get(block));
    }
    com.google.common.collect.Multimap<net.minecraft.block.Block, com.jplee.worldmanager.util.Replaceable> worldReplace = sortedReplaceables.get(world);
    if (worldReplace != null) {
        rep.addAll(worldReplace.get(block));
    }
    return rep;
}