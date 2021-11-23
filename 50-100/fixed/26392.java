private boolean ContainsJS(java.lang.String action) {
    boolean containsJS = false;
    try {
        containsJS = (coin.BotScriptEngine._mod.getDataArchive().getInputStream("ai-script.js")) != null;
        containsJS = containsJS && ((coin.BotScriptEngine._mod.getDataArchive().getInputStream(((action.replaceAll("\\s", "")) + ".js"))) != null);
    } catch (java.io.IOException e1) {
        containsJS = false;
    }
    return containsJS;
}