@java.lang.Override
public synchronized void saveAll() {
    try {
        varFileConfig.save(varFile);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}