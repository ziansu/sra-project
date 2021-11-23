public com.almightyalpaca.adbs4j.jda.AdvancedMessageBuilder ensureNewLine() {
    if (((this.builder.length()) == 0) || ((this.builder.charAt(this.builder.length())) == '\n')) {
        return this;
    }
    return this.newLine();
}