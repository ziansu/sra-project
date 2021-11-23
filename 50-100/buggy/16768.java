private void calculatePriceAfterTax(org.iabako.client.ui.layout.widget.tax.TaxField taxField, org.iabako.client.ui.form.business.expense.InputTextAmount fieldBeforeTax, org.iabako.client.ui.form.business.expense.InputTextAmount fieldAfterTax) {
    java.lang.Double priceBeforeTax = fieldBeforeTax.getAmountValue();
    java.lang.Double tax = taxField.getValue();
    if ((priceBeforeTax != null) && (tax != null)) {
        double priceAfterTax = priceBeforeTax * (1 + (tax / 100));
        fieldAfterTax.setValue((priceAfterTax + ""));
    }else {
        fieldAfterTax.setValue(null);
    }
}