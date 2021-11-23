private void applyMovement(core.game.Game game, tools.Vector2d action) {
    lastMovementType = this.physics.activeMovement(this, action, this.speed);
}