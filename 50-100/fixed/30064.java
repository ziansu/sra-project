public com.almightyalpaca.adbs4j.jda.AdvancedMessageBuilder ensureNewLine() {
    if (((this.builder.length()) == 0) || ((this.builder.charAt(((this.builder.length()) - 1))) == '\n')) {
        return this;
    }
    return this.newLine();
}