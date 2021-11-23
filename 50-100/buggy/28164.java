public boolean done() {
    if (sessions.isEmpty())
        throw new java.lang.IllegalStateException();
    
    if (!(sessions.peek().isReady()))
        return false;
    
    com.mantono.gym.Workout currentWorkout = sessions.remove();
    currentWorkout.done();
    sessions.add(currentWorkout);
    return true;
}