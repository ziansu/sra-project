public com.urcssa.Event.ManagerImpl.MidAutumnEventManagerImpl startEvent(int numGroups, int groupSize) {
    event = new com.urcssa.Event.EventImpl.MidAutumnEventImpl(numGroups, groupSize);
    return this;
}