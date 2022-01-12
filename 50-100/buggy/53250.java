private sim.util.Int2D calculatePosition(sim.util.Int2D position) {
    if ((position.getX()) > (Config.width)) {
        return new sim.util.Int2D(((position.getX()) % (Config.width)), position.y);
    }else
        if ((position.getX()) < 0) {
            return new sim.util.Int2D(((position.getX()) + (Config.width)), position.y);
        }else {
            return position;
        }
    
}