private void checkDebug() {
    try {
        config.getBoolean("debug", true);
        inDebug = true;
    } catch (java.lang.Exception e) {
        if (log.sendExceptionInfo(e))
            return ;
        
        e.printStackTrace();
    }
}