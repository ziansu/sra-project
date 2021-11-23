private net.minecraft.server.v1_8_R3.IBlockData getRandomBlock() {
    switch (this.random.nextInt(4)) {
        case 1 :
            return Blocks.SOUL_SAND.getBlockData();
        case 2 :
            return Blocks.OBSIDIAN.getBlockData();
        case 3 :
            return Blocks.BEDROCK.getBlockData();
        case 4 :
            return Blocks.BOOKSHELF.getBlockData();
    }
    return Blocks.SOUL_SAND.getBlockData();
}