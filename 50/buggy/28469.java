@java.lang.Override
public void run() {
    try {
        addVotes();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}