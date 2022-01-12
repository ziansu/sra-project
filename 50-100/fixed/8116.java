public boolean collidesWith(cz.cvut.fel.syrovkar.rpgEngine.archetypes.CollisionBox other) {
    return ((((this.x) <= ((other.x) + (other.sizeX))) && (((this.x) + (this.sizeX)) >= (other.x))) && ((this.y) <= ((other.y) + (other.sizeY)))) && (((this.y) + (this.sizeY)) >= (other.y));
}