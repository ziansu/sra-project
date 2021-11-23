@java.lang.Override
public void update(double elapsedTime) {
    switch (state) {
        case STATE_START :
            edu.byu.cs.superasteroids.AsteroidsGame.getSINGLETON().initLevel();
            state = edu.byu.cs.superasteroids.base.GameController.State_e.STATE_RUN;
            break;
        case STATE_RUN :
            edu.byu.cs.superasteroids.AsteroidsGame.getSINGLETON().update();
            break;
        case STATE_NEW_LEVEL :
            break;
        case STATE_END :
            break;
    }
}