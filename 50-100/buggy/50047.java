public void dispatchEvent(com.ikalagaming.event.Event event) throws java.lang.IllegalStateException {
    try {
        synchronized(this.queue) {
            this.queue.add(event);
        }
        this.hasEvents = true;
    } catch (java.lang.IllegalStateException illegalState) {
        throw illegalState;
    } catch (java.lang.NullPointerException nullPointer) {
        return ;
    } catch (java.lang.Exception e) {
        e.printStackTrace(java.lang.System.err);
        return ;
    }
    this.wakeUp();
}