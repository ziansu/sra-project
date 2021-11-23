public java.lang.String getGeneText() {
    java.lang.String text = this.gene.stream().reduce("", ( carry, e) -> (carry + e) + (this.seperator));
    return text.substring(0, ((text.length()) - 1));
}