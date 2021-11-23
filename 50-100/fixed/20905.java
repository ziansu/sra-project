@org.junit.Test
public void retrieveAcrobatRadioButtonProperties() throws java.io.IOException {
    org.sejda.sambox.pdmodel.interactive.form.PDRadioButton radioButton = ((org.sejda.sambox.pdmodel.interactive.form.PDRadioButton) (acrobatAcroForm.getField("RadioButtonGroup")));
    assertNotNull(radioButton);
    assertEquals(radioButton.getOnValues().size(), 2);
    assertTrue(radioButton.getOnValues().contains("RadioButton01"));
    assertTrue(radioButton.getOnValues().contains("RadioButton02"));
}