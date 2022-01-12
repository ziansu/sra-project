private boolean ContainsPY() {
    boolean containsPY = false;
    try {
        containsPY = (coin.BotScriptEngine._mod.getDataArchive().getInputStream("ai-script.py")) != null;
    } catch (java.io.IOException e1) {
        containsPY = false;
    }
    return containsPY;
}