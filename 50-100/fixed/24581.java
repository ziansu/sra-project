private bomberman.model.Actor FieldToActor(int x, int y, bomberman.model.Model.Field f) {
    switch (f) {
        case EMPTY :
            return new bomberman.model.Flor(x, y);
        case WALL :
            return new bomberman.model.Wall(x, y);
        case OBSTACLE :
            return new bomberman.model.Obst(x, y);
        case BOMB :
            return new bomberman.model.Bomb(x, y);
        default :
            throw new java.lang.IllegalArgumentException();
    }
    return null;
}