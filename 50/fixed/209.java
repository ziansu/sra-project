@java.lang.Override
public void execute() {
    eventBus.fireEventFromSource(new org.reactome.web.diagram.data.loader.InteractorsResourceChangedEvent(org.reactome.web.diagram.data.loader.LoaderManager.INTERACTORS_RESOURCE), this);
}