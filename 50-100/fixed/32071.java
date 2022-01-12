public java.lang.String getGeneText() {
    java.lang.String text = this.gene.stream().reduce("", ( carry, e) -> (carry + e) + (this.seperator));
    if ((text.length()) > 0)
        return text.substring(0, ((text.length()) - 1));
    else
        return "";
    
}