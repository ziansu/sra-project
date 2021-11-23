public void actionPerformed(java.awt.event.ActionEvent e) {
    if (ut.getTipo().equals("moderatore")) {
        panel_4.setVisible(false);
        new view.ModeratoreView(frmPiattaformaGaming, ut);
    }else
        if (ut.getTipo().equals("amministratore")) {
            panel_4.setVisible(false);
            new view.AmministratoreView(frmPiattaformaGaming, ut);
        }else {
            panel_4.setVisible(false);
            new view.UtenteView(frmPiattaformaGaming, ut);
        }
    
}