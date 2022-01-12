public void convertMessage() {
    this.convertedMessage = new int[this.finalMessage.length][1];
    for (int i = 0; i < (finalMessage.length); i++) {
        this.convertedMessage[i][0] = Utility.findAlphaIndex(this.finalMessage[i]);
    }
}