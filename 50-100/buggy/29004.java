public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (arg0.getActionCommand().equals(btnSpeichern.getActionCommand())) {
        getDatenAusMaske();
        schueler.speichern(new Fachklassen.Lehrer(1));
        this.dispose();
        Dialog.Dialog_adm_Schueler dlg_schueler = new Dialog.Dialog_adm_Schueler();
        dlg_schueler.setVisible(true);
    }else {
        this.dispose();
    }
}