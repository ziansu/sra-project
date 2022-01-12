@java.lang.Override
public void run() {
    if (this.stash.containsKey(item)) {
        final java.util.Set<java.util.UUID> uuids = this.stash.get(item);
        uuids.remove(player);
        if (uuids.isEmpty())
            this.stash.remove(item);
        
    }
}