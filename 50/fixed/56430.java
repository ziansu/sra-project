@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (ProbieGUI.doMore) {
        new java.lang.Thread(() -> next()).start();
    }
}