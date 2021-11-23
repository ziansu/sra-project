public final void resume() {
    synchronized(this) {
        this.mode = edu.kit.iti.formal.pse.worthwhile.debugger.model.WorthwhileDebugEventListener.DebugMode.DEBUG;
        notifyAll();
    }
}