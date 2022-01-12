public void start() {
    parent.disableButtons();
    parent.setProgBar_loading(0);
    i = 0;
    java.awt.event.ActionListener listener = new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if ((i) > 100) {
                timer.stop();
                parent.executeTasks();
            }else
                parent.setProgBar_loading(((i)++));
            
        }
    };
    timer = new javax.swing.Timer(15, listener);
    timer.start();
}