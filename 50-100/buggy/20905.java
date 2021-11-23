@org.junit.Test
public void retrieveAcrobatRadioButtonProperties() throws java.io.IOException {
    org.sejda.sambox.pdmodel.interactive.form.PDRadioButton radioButton = ((org.sejda.sambox.pdmodel.interactive.form.PDRadioButton) (acrobatAcroForm.getField("RadioButtonGroup")));
    org.junit.Assert.assertNotNull(radioButton);
    org.junit.Assert.assertEquals(radioButton.getOnValues().size(), 2);
    org.junit.Assert.assertTrue(radioButton.getOnValues().contains("RadioButton01"));
    org.junit.Assert.assertTrue(radioButton.getOnValues().contains("RadioButton02"));
}