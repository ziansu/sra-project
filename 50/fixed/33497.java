public void start() {
    this.agentThread = new org.appcelerator.kroll.runtime.v8.JSDebugger.DebugAgentThread("titanium-debug");
    this.agentThread.start();
    nativeEnable();
}