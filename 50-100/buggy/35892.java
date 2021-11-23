private void endIoOperation() {
    java.lang.Process o = io.getCurrent();
    cpu.insert(o);
    o.performIO();
    if ((io.size()) > 0) {
        Event e = new Event(END_IO, ((clock) + (avgIoTime)));
        eventQueue.insertEvent(e);
        java.lang.Process current = io.remove();
        gui.setIoActive(io.getCurrent());
    }
}