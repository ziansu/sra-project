@java.lang.Override
public void run() {
    try {
        while (!(close)) {
            java.lang.Thread.sleep(10);
        } 
        in.close();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}