private void checkOutput(final org.killbill.billing.invoice.api.Invoice invoice, final java.lang.String template, final java.lang.String expected, final java.util.Locale locale) {
    final java.util.Map<java.lang.String, java.lang.Object> data = new java.util.HashMap<java.lang.String, java.lang.Object>();
    data.put("invoice", new org.killbill.billing.invoice.template.formatters.DefaultInvoiceFormatter(config, invoice, locale, null, resourceBundleFactory, internalCallContext));
    final java.lang.String formattedText = templateEngine.executeTemplateText(template, data);
    org.testng.Assert.assertEquals(formattedText, expected);
}