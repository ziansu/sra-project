@java.lang.Override
protected void setPropertiesFromAttributes() {
    super.setPropertiesFromAttributes();
    if (isImpliedUnderline()) {
        setUnderline(true);
    }
    if (isImpliedStrikethrough()) {
        setStrikeThrough(true);
    }
    if ((getElement()) instanceof org.docx4all.swing.text.DocumentElement) {
        if (((org.docx4all.swing.text.DocumentElement) (getElement())).getSelected()) {
            setBackground(WordMLDocument.SELECTION_COLOR);
        }
        preferenceChanged(this, true, true);
    }
}