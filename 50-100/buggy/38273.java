@java.lang.Override
public void run() {
    for (int i = 0; i < 10; i++) {
        time = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss a"));
        repaint();
        try {
            thread.sleep(1000);
        } catch (java.lang.Exception e) {
        }
    }
    thread = null;
}