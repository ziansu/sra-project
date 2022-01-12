@java.lang.Override
public void run() {
    while (true) {
        time = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss a"));
        repaint();
        try {
            thread.sleep(1000);
        } catch (java.lang.Exception e) {
        }
    } 
}