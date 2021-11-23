private void fileChangeUpdate() {
    this.filenameLabel.setText(currentFileName);
    if (currentExtension.equals("txt"))
        this.sourceTypeLabel.setText("PlainText Mode");
    else
        if (currentExtension.equals("cpp"));
    
    this.sourceTypeLabel.setText("CPP Mode");
}