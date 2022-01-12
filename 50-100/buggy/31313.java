@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    if (isEditable()) {
        setEditable(false);
        input.add(com.github.pascalgn.jiracli.gui.ConsoleTextArea.INTERRUPT);
    }else {
        java.lang.Runnable listener = interruptListener;
        if (listener != null) {
            java.lang.Thread t = new java.lang.Thread(listener);
            t.setName("call-interrupt-listener");
            t.setDaemon(true);
            t.start();
        }
    }
}