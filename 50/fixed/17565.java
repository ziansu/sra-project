@java.lang.Override
public void resetSelection() {
    if (layoutManager.resetSelected()) {
        this.forceDraw = true;
        this.eventBus.fireEventFromSource(new org.reactome.web.diagram.client.GraphObjectSelectedEvent(null, false), this);
    }
}