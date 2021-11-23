private void endIoOperation() {
    if ((io.size()) > 0) {
        Event e = new Event(END_IO, ((clock) + (avgIoTime)));
        eventQueue.insertEvent(e);
    }
    java.lang.Process o = io.remove();
    cpu.insert(o);
    o.performIO();
    gui.setIoActive(io.getCurrent());
}