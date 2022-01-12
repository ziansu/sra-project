public java.lang.String getErrorMsg() {
    java.lang.String result = ("Validation of graph " + (this.graph.getName())) + " raised the following errors:\n";
    for (final java.lang.String msg : this.errorMsgs.keySet()) {
        result += ("- " + msg) + "\n";
    }
    return result;
}