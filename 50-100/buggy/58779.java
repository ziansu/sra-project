public boolean isBlockTracked(java.lang.Class<? extends net.minecraft.block.Block> block, int meta) {
    for (mytown.new_protection.SegmentBlock segment : segmentsBlocks) {
        if ((segment.theClass.isAssignableFrom(block)) && ((segment.meta) == meta))
            return true;
        
    }
    return false;
}