private void pass(AI.Player player) {
    javax.vecmath.Vector2d passVector = player.getPosition();
    passVector.sub(pitch.getBallPosition());
    javax.vecmath.Vector2d passLeadComponent = player.getVelocity();
    passLeadComponent.scale(findBallTime(passVector.length(), passVector.length()));
    passVector.add(passLeadComponent);
    team.kickBall(passVector);
}