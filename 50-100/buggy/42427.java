public void saveBlocks() {
    if (((blocksConfig) == null) || ((blocksConfig) == null)) {
        return ;
    }
    try {
        getBlocks().save(blocks);
    } catch (java.io.IOException ex) {
        getLogger().log(java.util.logging.Level.SEVERE, ("Could not save config to " + (players)), ex);
    }
}