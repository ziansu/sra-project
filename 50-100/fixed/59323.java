public net.minecraft.block.state.IBlockState getStraight(char c) {
    try {
        java.lang.Object o = palette.get(c);
        if (o instanceof net.minecraft.block.state.IBlockState) {
            return ((net.minecraft.block.state.IBlockState) (o));
        }else
            if (o instanceof java.lang.Character) {
                return Block.BLOCK_STATE_IDS.getByValue(((java.lang.Character) (o)));
            }else {
                return null;
            }
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}