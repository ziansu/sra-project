private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    indiceVolumen = ((float) (jComboBox1.getSelectedIndex())) / 10;
    if ((jComboBox1.getSelectedIndex()) == 0) {
        eVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mute.png")));
    }else
        eVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sound - Copy.png")));
    
}