@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (btnStart)) {
        audioThread = new java.lang.Thread(new authoring.ThreadRunnable());
        audioThread.start();
        java.lang.System.out.println("Start");
    }else
        if ((e.getSource()) == (btnStop)) {
            java.lang.System.out.println("Stop");
            audioThread.interrupt();
        }
    
}