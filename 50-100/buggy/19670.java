@org.junit.Test
public void retrieveAcrobatCheckBoxProperties() {
    org.sejda.sambox.pdmodel.interactive.form.PDCheckBox checkbox = ((org.sejda.sambox.pdmodel.interactive.form.PDCheckBox) (acrobatAcroForm.getField("Checkbox")));
    org.junit.Assert.assertNotNull(checkbox);
    org.junit.Assert.assertEquals(checkbox.getOnValue(), "Yes");
    org.junit.Assert.assertEquals(checkbox.getOnValues().size(), 1);
    org.junit.Assert.assertTrue(checkbox.getOnValues().contains("Yes"));
}