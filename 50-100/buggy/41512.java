public static void init() {
    com.drekryan.naturalenergy.block.ModBlocks.oreCopper = com.drekryan.naturalenergy.block.ModBlocks.register(new com.drekryan.naturalenergy.block.BlockOre("ore_copper", "oreCopper"));
    com.drekryan.naturalenergy.block.ModBlocks.cropCorn = com.drekryan.naturalenergy.block.ModBlocks.register(new com.drekryan.naturalenergy.block.BlockCropCorn(), null);
    com.drekryan.naturalenergy.block.ModBlocks.pedestal = com.drekryan.naturalenergy.block.ModBlocks.register(new com.drekryan.naturalenergy.block.pedestal.BlockPedestal());
    com.drekryan.naturalenergy.block.ModBlocks.altarStone = com.drekryan.naturalenergy.block.ModBlocks.register(new com.drekryan.naturalenergy.block.BlockBase(net.minecraft.block.material.Material.ROCK, "altar_stone"));
    com.drekryan.naturalenergy.block.ModBlocks.counter = com.drekryan.naturalenergy.block.ModBlocks.register(new com.drekryan.naturalenergy.block.counter.BlockCounter());
    com.drekryan.naturalenergy.block.ModBlocks.altarStone.setHardness(3.0F).setResistance(5.0F);
}