private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
    stream.writeObject(trieConfig);
    stream.writeObject(rootState);
    stream.writeBoolean(failureStatesConstructed);
}