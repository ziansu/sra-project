private void saveSession(java.lang.String pathToSave) throws java.io.IOException {
    hr.fer.kba_authentication.profiling.gui.PausedSessionInfoHolder pausedSession = new hr.fer.kba_authentication.profiling.gui.PausedSessionInfoHolder(queue, userProfile, sessionInfo, currentAttempt, challengesGenerated, answeredCounter, answeredCorrectCounter, answeredIncorrectCounter, generationFinished, firstChallengeShown);
    if (!(pathToSave.endsWith(PausedSessionInfoHolder.PAUSE_EXTENSION)))
        pathToSave += PausedSessionInfoHolder.PAUSE_EXTENSION;
    
    java.io.OutputStream file = new java.io.FileOutputStream((pathToSave + (PausedSessionInfoHolder.PAUSE_EXTENSION)));
    java.io.OutputStream buffer = new java.io.BufferedOutputStream(file);
    java.io.ObjectOutput output = new java.io.ObjectOutputStream(buffer);
    output.writeObject(pausedSession);
    output.close();
}