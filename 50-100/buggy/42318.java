public competition.subsystems.vision.BallSpatialInfo findTargetBall() {
    competition.subsystems.vision.BallSpatialInfo[] ballInfo = this.getBoulderInfo();
    competition.subsystems.vision.BallSpatialInfo targetBall = null;
    for (competition.subsystems.vision.BallSpatialInfo ball : ballInfo) {
        if ((targetBall == null) || ((ball.distanceInches) > (targetBall.distanceInches))) {
            targetBall = ball;
        }
    }
    return targetBall;
}