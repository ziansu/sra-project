public void scheduleRestore(org.bukkit.block.BlockState state, int seconds) {
    com.minecarts.miraclegrow.BlockStateRestore restore = new com.minecarts.miraclegrow.BlockStateRestore(state, seconds);
    java.util.HashSet<com.minecarts.miraclegrow.BlockStateRestore> set = queue.get(state.getWorld());
    if (set == null) {
        set = new java.util.HashSet<com.minecarts.miraclegrow.BlockStateRestore>();
        queue.put(state.getWorld(), set);
    }
    set.add(restore);
}