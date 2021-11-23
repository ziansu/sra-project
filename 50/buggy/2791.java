@java.lang.Override
public void run() {
    notifyObservers(assetType, dataEventType, parameters);
}