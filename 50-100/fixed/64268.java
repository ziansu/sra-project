private static com.udacity.desromj.kerfuffle.ai.MoveBehaviour getBehaviour(java.lang.String tag, com.udacity.desromj.kerfuffle.entity.Shooter parent, float speed, float retargetDelay, boolean clockwise) {
    com.udacity.desromj.kerfuffle.ai.MoveBehaviour behaviour;
    com.udacity.desromj.kerfuffle.ai.MoveType type = com.udacity.desromj.kerfuffle.ai.MoveType.getType(tag);
    switch (type) {
        case CIRCLE_OFFSCREEN :
            return new com.udacity.desromj.kerfuffle.ai.CircleOffscreenBehaviour(parent, speed, clockwise);
        case HOMING :
            return new com.udacity.desromj.kerfuffle.ai.HomingMoveBehaviour(parent, speed, retargetDelay);
        default :
            return new com.udacity.desromj.kerfuffle.ai.StationaryMoveBehaviour(parent, 0.0F);
    }
}