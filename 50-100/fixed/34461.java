@org.junit.Test
public void createCheckBox() {
    org.sejda.sambox.pdmodel.interactive.form.PDButton buttonField = new org.sejda.sambox.pdmodel.interactive.form.PDCheckBox(acroForm);
    assertEquals(buttonField.getFieldType(), buttonField.getCOSObject().getNameAsString(COSName.FT));
    assertEquals(buttonField.getFieldType(), "Btn");
    assertFalse(buttonField.isPushButton());
    assertFalse(buttonField.isRadioButton());
}