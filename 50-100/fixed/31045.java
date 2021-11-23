@org.junit.Test
public void createPushButton() {
    org.sejda.sambox.pdmodel.interactive.form.PDButton buttonField = new org.sejda.sambox.pdmodel.interactive.form.PDPushButton(acroForm);
    assertEquals(buttonField.getFieldType(), buttonField.getCOSObject().getNameAsString(COSName.FT));
    assertEquals(buttonField.getFieldType(), "Btn");
    assertTrue(buttonField.isPushButton());
    assertFalse(buttonField.isRadioButton());
}