@java.lang.Override
public void run() {
    if (!(mcMMO.getPlaceStore().isTrue(movedBlock))) {
        return ;
    }
    if (!(com.gmail.nossr50.util.BlockUtils.isPistonPiece(movedBlock.getState()))) {
        return ;
    }
    mcMMO.getPlaceStore().setFalse(movedBlock);
    mcMMO.getPlaceStore().setTrue(block.getRelative(direction));
}