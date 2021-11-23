private bomberman.model.Actor FieldToActor(int x, int y, bomberman.model.Model.Field f) {
    switch (f) {
        case EMPTY :
            return new bomberman.model.Flor(x, y);
            break;
        case WALL :
            return new bomberman.model.Wall(x, y);
            break;
        case OBSTACLE :
            return new bomberman.model.Obst(x, y);
            break;
        case BOMB :
            return new bomberman.model.Bomb(x, y);
            break;
        default :
            throw new java.lang.IllegalArgumentException();
    }
}