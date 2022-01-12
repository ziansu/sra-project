@java.lang.Override
public void run() {
    try {
        while (!(isClosing)) {
            if ((!(isPainted)) && (!(isPaintError))) {
                doPaint();
                if (!(isPaintError))
                    firstPainted = true;
                
                isUpdated = false;
            }
            java.lang.Thread.sleep(100);
        } 
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}