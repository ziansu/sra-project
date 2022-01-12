private static org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper getInstance() {
    long key = java.lang.Thread.currentThread().getId();
    if (!(org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.instances.containsKey(key))) {
        org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.instances.put(key, new org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper());
    }
    return org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.instances.get(key);
}