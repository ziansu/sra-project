public void onAppStop() {
    this.appHooks = new java.util.HashMap<>();
    this.chatCommands = new java.util.HashMap<>();
    this.context = null;
    this.appObject = null;
    this.chatCommands = new java.util.HashMap<>();
    callHook("onAppStop");
}