@org.junit.Test
public void retrieveAcrobatCheckBoxProperties() {
    org.sejda.sambox.pdmodel.interactive.form.PDCheckBox checkbox = ((org.sejda.sambox.pdmodel.interactive.form.PDCheckBox) (acrobatAcroForm.getField("Checkbox")));
    assertNotNull(checkbox);
    assertEquals(checkbox.getOnValue(), "Yes");
    assertEquals(checkbox.getOnValues().size(), 1);
    assertTrue(checkbox.getOnValues().contains("Yes"));
}