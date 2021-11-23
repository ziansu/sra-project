@java.lang.Override
public void run() {
    try {
        while (true) {
            mainFrame.repaint();
            java.lang.System.out.println("repaint");
        } 
    } catch (java.lang.Exception ex) {
    }
}