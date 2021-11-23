public synchronized void finalizeObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    objects.remove(obj.valueRef());
}