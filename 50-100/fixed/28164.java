public boolean done() {
    if (sessions.isEmpty())
        throw new java.lang.IllegalStateException();
    
    if (!(sessions.first().isReady()))
        return false;
    
    com.mantono.gym.Workout currentWorkout = sessions.first();
    sessions.remove(currentWorkout);
    currentWorkout.done();
    sessions.add(currentWorkout);
    return true;
}