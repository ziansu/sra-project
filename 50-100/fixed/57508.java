private void westEnabledActionPerformed(java.awt.event.ActionEvent evt) {
    if ((AutoFiller.Main.odd8) == 0) {
        westEnabled.setBackground(java.awt.Color.green);
        (AutoFiller.Main.odd8)++;
    }else
        if ((AutoFiller.Main.odd8) == 1) {
            westEnabled.setBackground(java.awt.Color.LIGHT_GRAY);
            (AutoFiller.Main.odd8)--;
        }
    
}