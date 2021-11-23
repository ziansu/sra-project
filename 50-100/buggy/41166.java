public void convertMessage() {
    this.convertedMessage = new int[this.finalMessage.length];
    for (int i = 0; i < (finalMessage.length); i++) {
        this.convertedMessage[i] = Utility.findAlphaIndex(this.finalMessage[i]);
    }
}