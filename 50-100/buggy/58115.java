public void checkValidity() {
    this.checkLength();
    this.checkCase();
    this.checkDigit();
    this.checkSymbol();
    this.addToReport();
    if (((((this.lengthOK) && (this.lowercaseOK)) && (this.uppercaseOK)) && (this.digitOK)) && (this.symbolOK)) {
        this.reportOK = true;
    }
}