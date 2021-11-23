@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String ac = e.getActionCommand().toLowerCase();
    switch (ac) {
        case "roll" :
            rollButton();
            break;
        case "done" :
            doneButton();
            break;
        default :
            java.lang.System.out.println(("No Command for: " + ac));
            break;
    }
    window.pack();
}