public void startTrick(com.mrcrayfish.skateboarding.api.trick.Trick trick) {
    inTrick = true;
    currentTrick = trick;
    if (trick instanceof com.mrcrayfish.skateboarding.api.trick.Flip) {
        onGround = false;
    }
    if (trick instanceof com.mrcrayfish.skateboarding.api.trick.Grind) {
        if (com.mrcrayfish.skateboarding.util.GrindHelper.canGrind(worldObj, posX, posY, posZ)) {
            jumping = false;
            grinding = true;
        }else {
            inTrick = false;
            currentTrick = null;
        }
    }
}