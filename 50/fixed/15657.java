@java.lang.Override
public void run() {
    super.run();
    for (; ;) {
        try {
            nextCharacter();
            java.lang.Thread.sleep(getPauseTime());
        } catch (java.lang.InterruptedException ie) {
            return ;
        }
    }
}