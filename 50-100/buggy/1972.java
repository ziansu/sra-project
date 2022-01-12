@com.google.common.eventbus.Subscribe
public void listen(net.sf.jabref.model.entry.event.EntryChangedEvent entryChangedEvent) {
    lock();
    try {
        int index = list.indexOf(entryChangedEvent.getBibEntry());
        if (index != (-1)) {
            list.set(index, entryChangedEvent.getBibEntry());
        }
    } finally {
        unlock();
    }
}