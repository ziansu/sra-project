private void updateText() {
    java.lang.String finalText;
    if (!(this.progressText.equals(""))) {
        finalText = this.progressText;
    }else {
        finalText = "";
    }
    if ((!(this.progressText.equals(""))) && (!(this.controlText.equals("")))) {
        finalText = finalText + " - ";
    }
    finalText = finalText + (controlText);
    super.setText(finalText);
}