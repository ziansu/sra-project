@java.lang.Override
public void stateChanged(plm.core.model.Game.GameState state) {
    switch (state) {
        case DEMO_ENDED :
        case EXECUTION_ENDED :
            plm.core.model.lesson.Exercise e = ((plm.core.model.lesson.Exercise) (currGame.getCurrentLesson().getCurrentExercise()));
            listener.send();
            send(e.lastResult, currGame.i18n);
            server.Main.freeMain();
            break;
        default :
            break;
    }
}