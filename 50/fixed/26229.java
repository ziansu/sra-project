public java.lang.String replace(java.lang.String input) {
    input = input.toLowerCase();
    for (java.lang.String wrong : this.wrong) {
        input = input.replace(wrong, replacement);
    }
    return input;
}