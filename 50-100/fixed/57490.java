public void actionPerformed(java.awt.event.ActionEvent event) {
    boolean problem = tubeComponent.isBrokenCannula();
    if (problem) {
        edu.hawaii.jabsom.tri.ecmo.app.view.dialog.DialogBase.showDialog(this, DialogType.SUCCESS, DialogOption.OK, king.lib.util.Translator.getString("title.ProblemFixed[i18n]: Problem Fixed"), king.lib.util.Translator.getString(("text.PatientDialogCannula[i18n]: " + "Good catch! The cannula site was kinked and has been fixed.")), new edu.hawaii.jabsom.tri.ecmo.app.view.comp.DialogListener() {
            public void handleResult(edu.hawaii.jabsom.tri.ecmo.app.view.comp.DialogResult result) {
                handlePatientAction(PatientAction.Check.CANNULA_SITE);
            }
        });
    }else {
        showOKDialog(PatientAction.Check.CANNULA_SITE);
    }
}