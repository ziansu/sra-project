@javax.inject.Inject
@org.eclipse.e4.core.di.annotations.Optional
void eventReceivedRelatingObjectsLoadedEvents(@org.eclipse.e4.core.di.extensions.EventTopic(value = "event_text_relating_objects/*")
final org.bbaw.bts.ui.commons.corpus.events.BTSRelatingObjectsLoadingEvent event) {
    parentObject = event.getObject();
    queryId = "relations.objectId-" + (parentObject.get_id());
    if (event != null) {
        this.relatingObjectsEvent = event;
        sync.syncExec(new java.lang.Runnable() {
            public void run() {
                loadRelatingObjects(event);
            }
        });
    }
}