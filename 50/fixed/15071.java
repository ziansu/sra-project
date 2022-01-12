@java.lang.Override
public synchronized void saveAll() {
    try {
        synchronized(varFileConfig) {
            varFileConfig.save(varFile);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}