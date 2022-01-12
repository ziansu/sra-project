private void jButton39MouseClicked(java.awt.event.MouseEvent evt) {
    if (!(jList3.isSelectionEmpty())) {
        if (jTextField51.getText().equals(""))
            showWinAlert(jPanel17, "Inserire una quantità.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        
        if ((java.lang.Integer.parseInt(jTextField51.getText())) > 0) {
            importArticle();
        }else
            showWinAlert(jPanel17, "Quantità pezzi inesatta.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        
    }else
        showWinAlert(jPanel17, "Selezionare un pezzo prima di importalo.", "Warning Selection", javax.swing.JOptionPane.WARNING_MESSAGE);
    
}