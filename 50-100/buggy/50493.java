@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JButton source = ((javax.swing.JButton) (e.getSource()));
    java.lang.String currentText = source.getText();
    if ((currentText.equals("_")) && ((player) == true)) {
        source.setText("X");
    }else
        if ((currentText.equals("_")) && ((player) == false)) {
            source.setText("O");
        }
    
    player = !(player);
}