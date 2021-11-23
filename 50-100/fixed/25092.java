@java.lang.Override
public java.util.List<org.sonatype.nexus.formfields.FormField> formFields() {
    final org.sonatype.nexus.formfields.CheckboxFormField checkbox = new org.sonatype.nexus.formfields.CheckboxFormField("cbId", "Checkbox test", "This field is for testing the check boxes", false);
    final org.sonatype.nexus.formfields.TextAreaFormField textarea = new org.sonatype.nexus.formfields.TextAreaFormField("taId", "text area test", "This field is for testing the text area", false);
    final java.util.List<org.sonatype.nexus.formfields.FormField> list = new java.util.ArrayList<>();
    list.add(checkbox);
    list.add(textarea);
    return list;
}