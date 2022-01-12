public static uk.ac.man.cs.llvm.bc.blocks.Block lookup(long id) {
    if (id == 0) {
        return uk.ac.man.cs.llvm.bc.blocks.Block.BLOCKINFO;
    }else
        if ((id >= (uk.ac.man.cs.llvm.bc.blocks.Block.MODULE.getId())) && (id <= (uk.ac.man.cs.llvm.bc.blocks.Block.METADATA_KIND.getId()))) {
            int index = ((int) (id)) - ((uk.ac.man.cs.llvm.bc.blocks.Block.MODULE.getId()) - (uk.ac.man.cs.llvm.bc.blocks.Block.MODULE.ordinal()));
            return uk.ac.man.cs.llvm.bc.blocks.Block.values()[index];
        }
    
    return null;
}