@java.lang.Override
protected void newPlayer(com.github.unchama.player.GiganticPlayer gp) {
    com.github.unchama.player.mineblock.MineBlockManager m = gp.getManager(com.github.unchama.player.mineblock.MineBlockManager.class);
    java.util.HashMap<com.github.unchama.player.mineblock.BlockType, com.github.unchama.player.mineblock.MineBlock> datamap = m.datamap;
    for (com.github.unchama.player.mineblock.BlockType bt : com.github.unchama.player.mineblock.BlockType.values()) {
        datamap.put(bt, new com.github.unchama.player.mineblock.MineBlock());
    }
    m.all = new com.github.unchama.player.mineblock.MineBlock();
    m.level = 1;
}