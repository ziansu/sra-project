private boolean ActorIsOnHole(caverunner.Sprite theActor) {
    caverunner.Block thisBlock;
    caverunner.Block blockBelow;
    caverunner.BlockLocation location;
    thisBlock = getBlockActorIsIn(theActor.Location);
    location = thisBlock.Location.locationBelow();
    blockBelow = getBlock(location);
    if ((blockBelow != null) && ((blockBelow.Type) != (BlockTypes.HOLE)))
        return true;
    
    return false;
}