@com.google.common.eventbus.Subscribe
public void listen(net.sf.jabref.model.entry.event.EntryChangedEvent entryChangedEvent) {
    lock();
    try {
        for (int i = 0; i < (list.size()); i++) {
            if ((list.get(i)) == (entryChangedEvent.getBibEntry())) {
                list.set(i, entryChangedEvent.getBibEntry());
                break;
            }
        }
    } finally {
        unlock();
    }
}