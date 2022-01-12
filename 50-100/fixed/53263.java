public Simulation.Block getBlock(Simulation.BlockLocation blkloc) {
    if (isValidBlockLoc(blkloc)) {
        if ((level.get(blkloc.p).getBlock(blkloc)) == null) {
            setBlock(blkloc, new Simulation.Block(0, this));
        }
        return level.get(blkloc.p).getBlock(blkloc);
    }else {
        return null;
    }
}