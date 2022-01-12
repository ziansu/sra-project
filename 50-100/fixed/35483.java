@java.lang.Override
public void init(int id) {
    this.id = id;
    type = Type.TOMBEUR;
    direction = Direction.DROITIER;
    java.awt.Point entrance = gameEng.getLevel().getEntrance();
    x = entrance.x;
    y = entrance.y;
    isGrimpeur = true;
    isFlotteur = false;
    isBuilder = false;
    isCurrentlyBuilding = false;
    isCurrentlyClimbing = false;
    nombreToursBuilder = 0;
    isExploseur = false;
    tombeDepuis = 0;
    exploseurDepuis = 0;
}