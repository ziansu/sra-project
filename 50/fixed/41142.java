public void stop() {
    this.stop.set(true);
    this.v8Messages.add(org.appcelerator.kroll.runtime.v8.JSDebugger.V8MessageHandler.STOP_MESSAGE);
}