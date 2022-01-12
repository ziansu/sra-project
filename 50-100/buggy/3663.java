protected void log(java.util.Map map) {
    java.util.Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry entry = ((java.util.Map.Entry) (it.next()));
        this.console.printLine(((((getPluginLogPrefix()) + (entry.getKey())) + " : ") + (entry.getValue())));
        it.remove();
    } 
}