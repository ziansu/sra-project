public void start() {
    this.agentThread = new org.appcelerator.kroll.runtime.v8.JSDebugger.DebugAgentThread("titanium-debug");
    this.agentThread.start();
    org.appcelerator.kroll.common.Log.v(org.appcelerator.kroll.runtime.v8.JSDebugger.TAG, "Enabling debugging with V8 in C++...");
    nativeEnable();
}