@com.google.appinventor.components.runtime.SimpleFunction(description = "Creates a new player sprite.")
public void CreatePlayer(java.lang.String group, java.lang.String name, int x, int y, int gravity) {
    webview.loadUrl((((((((((("javascript:api.CreatePlayer(" + (dumpStr(group))) + ",") + (dumpStr(name))) + ",") + x) + ",") + y) + ",") + gravity) + ")"));
}