@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int id;
    javax.swing.JButton button = ((javax.swing.JButton) (e.getSource()));
    if (button.equals(yesButton))
        id = ButtonEvent.YES;
    else
        if (button.equals(noButton))
            id = ButtonEvent.NO;
        else
            id = ButtonEvent.CANCEL;
        
    
    dispatchButtonEvent(new dialog.ButtonEvent(dialog, id));
}