private void updateText() {
    java.lang.String finalText;
    if (!(this.progressText.equals(""))) {
        finalText = this.progressText;
    }else {
        finalText = "";
    }
    if (!(this.controlText.equals(""))) {
        if (!(this.progressText.equals(""))) {
            finalText = finalText + " - ";
        }
        finalText = finalText + (controlText);
    }else {
        finalText = controlText;
    }
    super.setText(finalText);
}