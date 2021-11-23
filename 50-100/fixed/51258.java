public com.example.crunky.smartminifab.Block[] GetPlacedBlocks() {
    com.example.crunky.smartminifab.Block[] blocklist = null;
    if ((m_placedBlocks) != null) {
        blocklist = new com.example.crunky.smartminifab.Block[m_placedBlocks.size()];
        int i = 0;
        for (com.example.crunky.smartminifab.Block block : m_placedBlocks) {
            blocklist[(i++)] = block;
        }
    }
    return blocklist;
}