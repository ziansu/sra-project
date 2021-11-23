@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
public void testValidateForDelete_shouldFailWithNullInvoice() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = null;
    invoiceValidator.validateForDelete(invoice);
}