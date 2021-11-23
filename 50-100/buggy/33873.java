private java.util.Map<no.uio.ifi.qure.Block, no.uio.ifi.qure.Block> getSplitBlocks(no.uio.ifi.qure.Block b) {
    java.util.Map<no.uio.ifi.qure.Block, no.uio.ifi.qure.Block> m = new java.util.HashMap<no.uio.ifi.qure.Block, no.uio.ifi.qure.Block>();
    int n = evenSplits.size();
    for (no.uio.ifi.qure.Block block : evenSplits.keySet()) {
        if (block.blockPartOf(b))
            m.put(block, evenSplits.get(block));
        
    }
    return m;
}