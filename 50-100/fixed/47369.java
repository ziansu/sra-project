@java.lang.Override
public void run() {
    if (!(mcMMO.getPlaceStore().isTrue(movedBlock.getRelative(direction)))) {
        return ;
    }
    if (!(com.gmail.nossr50.util.BlockUtils.isPistonPiece(movedBlock.getState()))) {
        return ;
    }
    mcMMO.getPlaceStore().setFalse(movedBlock.getRelative(direction));
    mcMMO.getPlaceStore().setTrue(movedBlock);
}