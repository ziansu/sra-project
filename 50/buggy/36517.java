public com.urcssa.Event.ManagerImpl.MidAutumnEventManagerImpl startEvent(int groupSize, int numGroups) {
    event = new com.urcssa.Event.EventImpl.MidAutumnEventImpl(groupSize, numGroups);
    return this;
}