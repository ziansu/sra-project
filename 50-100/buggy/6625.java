public synchronized void calculateReceiptsVisibility(org.iabako.client.ui.form.business.sale.SalePaymentsForm salePaymentsForm) {
    org.iabako.client.ui.layout.widget.payment.PaymentTable installmentsTable = salePaymentsForm.getInstallmentTable();
    int installmentsNumber = (installmentsTable != null) ? installmentsTable.queryDefinitionDTO.getCountTotal() : 0;
    int invoicesNumber = ((invoiceTable) != null) ? invoiceTable.queryDefinitionDTO.getCountTotal() : 0;
    if ((invoicesNumber == 1) && (installmentsNumber == 0)) {
        receiptsPanel.setVisible(false);
    }else {
        receiptsPanel.setVisible(true);
    }
}