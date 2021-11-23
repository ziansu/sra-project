@java.lang.Override
public void run() {
    while (run) {
        try {
            java.lang.Thread.sleep(5000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        board.doQuestionEvent();
    } 
}