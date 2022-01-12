@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object src = e.getSource();
    for (int i = 0; i < (buttons.length); i++) {
        if ((buttons[i]) == src)
            changeSpots(i);
        
    }
}