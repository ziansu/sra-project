@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JButton source = ((javax.swing.JButton) (e.getSource()));
    java.lang.String currentText = source.getText();
    if (currentText.equals("_")) {
        if (player)
            source.setText("X");
        else
            source.setText("0");
        
        player = !(player);
    }
}