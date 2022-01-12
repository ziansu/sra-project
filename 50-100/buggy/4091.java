public void addHorizontalMovement(int amount) {
    if (isAlive()) {
        this.horizontalMovement = java.lang.Math.min(horizontalMovement, Server.Creatures.ServerPlayer.MAX_HSPEED);
        respawnXSpeed = this.horizontalMovement;
    }else
        respawnXSpeed = java.lang.Math.min(((respawnXSpeed) + amount), Server.Creatures.ServerPlayer.MAX_HSPEED);
    
}