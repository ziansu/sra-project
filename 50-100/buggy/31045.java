@org.junit.Test
public void createPushButton() {
    org.sejda.sambox.pdmodel.interactive.form.PDButton buttonField = new org.sejda.sambox.pdmodel.interactive.form.PDPushButton(acroForm);
    org.junit.Assert.assertEquals(buttonField.getFieldType(), buttonField.getCOSObject().getNameAsString(COSName.FT));
    org.junit.Assert.assertEquals(buttonField.getFieldType(), "Btn");
    org.junit.Assert.assertTrue(buttonField.isPushButton());
    org.junit.Assert.assertFalse(buttonField.isRadioButton());
}