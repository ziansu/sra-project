@java.lang.Override
public void run() {
    try {
        (org.teavm.classlib.java.lang.TThread.activeCount)++;
        org.teavm.classlib.java.lang.TThread.setCurrentThread(this);
        target.run();
    } finally {
        (org.teavm.classlib.java.lang.TThread.activeCount)--;
        org.teavm.classlib.java.lang.TThread.setCurrentThread(org.teavm.classlib.java.lang.TThread.mainThread);
    }
}