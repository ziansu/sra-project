public void initializeFields() {
    installmentsFrequency.setRawValue(InstallmentsFrequency.periodical);
    if (salesForm) {
        installmentsType.setVisible(false);
        installmentsType.setRawValue(false);
        installmentsDefinedNumber.setVisible(true);
        if (org.iabako.shared.tools.GenericTools.isEmpty(installmentsDefinedNumber.getValue())) {
            installmentsNumber = 1;
            installmentsDefinedNumber.setValue(((installmentsNumber) + ""));
        }
    }else {
        installmentsType.setEnabled(true);
        installmentsType.setHelpInfo("expense_form_undefined_question_help");
    }
    showInstallmentsPeriodicalPanel();
    showCustomInstallmentsFields();
}