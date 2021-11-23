public void revertFrozenBlocks() {
    if (active_types.contains(com.projectkorra.projectkorra.waterbending.ice.PhaseChange.PhaseChangeType.FREEZE)) {
        for (com.projectkorra.projectkorra.util.TempBlock tb : blocks) {
            tb.revertBlock();
        }
        blocks.clear();
        com.projectkorra.projectkorra.waterbending.ice.PhaseChange.PLAYER_BY_BLOCK.remove(player);
    }
}