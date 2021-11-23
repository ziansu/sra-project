@java.lang.Override
public void onReady() {
    com.eikospartners.windowmanagerjsdemo.Main.logMessage("CONNECTED!");
    for (int i = 0; i < (readyListeners.size()); i++)
        readyListeners.get(i).Ready();
    
}