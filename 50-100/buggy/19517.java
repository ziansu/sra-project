private void updateMove(engine.character.CharacterInputComp inputComp, engine.physics.PhysicsComp phComp) {
    float speed = 8;
    float stepX = ((inputComp.isMoveRight() ? 1 : 0) - (inputComp.isMoveLeft() ? 1 : 0)) * speed;
    float stepY = ((inputComp.isMoveDown() ? 1 : 0) - (inputComp.isMoveUp() ? 1 : 0)) * speed;
    phComp.addAcceleration(new engine.maths.Vec2(stepX, stepY));
}