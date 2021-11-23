@de.lessvoid.nifty.NiftyEventSubscriber(id = "logger_listbox")
public void logItemSelected(final java.lang.String id, final de.lessvoid.nifty.controls.ListBoxSelectionChangedEvent<julietgroupproject.GUI.julietgroupproject.GenerationResult> event) {
    if ((event.getSelection().size()) > 0) {
        app.showOffGeneration(((event.getSelection().get(0).generation) - 1));
    }
}