private void setErrorStyle(org.eclipse.swt.custom.StyleRange range) {
    range.underline = true;
    range.underlineStyle = org.eclipse.swt.SWT.UNDERLINE_ERROR;
    range.underlineColor = org.nschmidt.ldparteditor.enums.Colour.line_error_underline;
    range.length = (range.length) - 1;
}