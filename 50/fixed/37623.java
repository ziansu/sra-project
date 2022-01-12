public boolean removeTimeLogEntry(net.sf.memoranda.TimeLogEntry entry) {
    _root.removeChild(entry.getContent());
    return true;
}