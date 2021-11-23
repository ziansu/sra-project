public void setCurrentText(java.lang.String text) {
    if (((this.currentText) == null) || (!(this.currentText.equals(text))))
        changed = true;
    else
        changed = false;
    
    this.currentText = text;
}