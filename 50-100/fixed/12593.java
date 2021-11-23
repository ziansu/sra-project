private void treatFormatId(java.lang.String formatId, forms.Test test) {
    forms.TestFormat format = new forms.TestFormat();
    try {
        validateFormatId(formatId);
        format.setId(java.lang.Long.parseLong(formatId));
    } catch (java.lang.Exception e) {
        setError(forms.TestForm.FORMAT_FIELD, e.getMessage());
    }
    test.setFormat(format);
}