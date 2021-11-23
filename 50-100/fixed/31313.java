@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    if (isEditable()) {
        setEditable(false);
        input.add(com.github.pascalgn.jiracli.gui.ConsoleTextArea.INTERRUPT);
    }else {
        java.lang.Thread t = new java.lang.Thread(interruptListener);
        t.setName("call-interrupt-listener");
        t.setDaemon(true);
        t.start();
    }
}