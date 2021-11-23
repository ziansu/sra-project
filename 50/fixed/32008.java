private void checkDebug() {
    try {
        config.getBoolean("debug");
        inDebug = true;
    } catch (java.lang.Exception e) {
        if (log.sendExceptionInfo(e))
            return ;
        
        e.printStackTrace();
    }
}