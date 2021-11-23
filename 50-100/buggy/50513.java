public void onRedstoneSignal(boolean isSignal) {
    if (world.isBlockPowered(pos)) {
        if ((!(isPowered)) && isSignal) {
            dalapo.factech.helper.Logger.info("About to enter transferStack()");
            if ((((dalapo.factech.block.BlockStackMover) (world.getBlockState(getPos()).getBlock())).tier) == 2)
                transferStacks();
            else
                transferStack();
            
            isPowered = true;
        }
    }else
        if (!isSignal)
            isPowered = false;
        
    
}