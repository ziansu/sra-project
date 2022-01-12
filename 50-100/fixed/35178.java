boolean FeatureIsInBlock(caverunner.Sprite Troll, caverunner.BlockTypes feature) {
    caverunner.Block thisBlock;
    thisBlock = getBlockActorIsIn(Troll.Location);
    switch (feature) {
        case LADDER :
            if ((thisBlock.Type) == (BlockTypes.LADDER))
                return true;
            
            break;
        case HOLE :
            if (canActorMoveDown(Troll))
                return true;
            
            break;
    }
    return false;
}