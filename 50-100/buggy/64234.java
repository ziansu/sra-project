public void setUndefinedFields() {
    paymentType.setVisible(false);
    paymentMethod.setVisible(false);
    paymentType.setRawValue(PaymentType.installments);
    installmentsFormPanel.setVisible(true);
    installmentsForm.installmentsType.setValue(true);
    installmentsForm.installmentsType.setEnabled(false);
    installmentsForm.installmentsType.setVisible(true);
    installmentsForm.enableInstallmentTypeValues();
}