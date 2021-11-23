private void informListenersAboutNewDegree(float degree) {
    for (org.groundhoglabs.assistants.CompassAssistant.CompassAssistantListener l : this.listeners) {
        l.onNewDegreesToNorth((-degree));
    }
}