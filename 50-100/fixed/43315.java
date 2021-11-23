@org.junit.Test
public void testUncheck() throws java.io.IOException {
    org.sejda.sambox.pdmodel.interactive.form.PDCheckBox checkbox = ((org.sejda.sambox.pdmodel.interactive.form.PDCheckBox) (acrobatAcroForm.getField("Checkbox")));
    checkbox.unCheck();
    assertEquals(checkbox.getValue(), COSName.Off.getName());
    assertEquals(checkbox.isChecked(), false);
}