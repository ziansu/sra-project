public void checkCollision() {
    java.util.List<edu.chl.proximity.Models.Creeps.Creep> creeps = edu.chl.proximity.Models.GameData.getInstance().getMap().getCreeps();
    for (edu.chl.proximity.Models.Creeps.Creep creep : creeps) {
        if (collidesWith(creep, 20)) {
            collide(creep);
        }
    }
}