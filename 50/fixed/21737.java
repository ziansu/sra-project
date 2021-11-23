public void actionPerformed(java.awt.event.ActionEvent e) {
    java.awt.Color newColor = javax.swing.JColorChooser.showDialog(null, "Paint Color", m.fgColor);
    if (!(newColor == null)) {
        m.fgColor = newColor;
        color = m.fgColor;
    }else {
        return ;
    }
}