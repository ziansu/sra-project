@java.lang.Override
public void receiveCommand(android.webkit.WebView root, int commandId, @javax.annotation.Nullable
com.facebook.react.bridge.ReadableArray args) {
    super.receiveCommand(root, commandId, args);
    switch (commandId) {
        case com.github.alinz.reactnativewebviewbridge.WebViewBridgeManager.COMMAND_INJECT_BRIDGE_SCRIPT :
            injectBridgeScript(root);
            break;
        case com.github.alinz.reactnativewebviewbridge.WebViewBridgeManager.COMMAND_SEND_TO_BRIDGE :
            sendToBridge(root, args.getString(0));
            break;
    }
}