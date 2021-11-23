public static java.lang.String outputHeightOrNA(java.lang.Integer feet, java.lang.Integer inches) {
    if (((feet == null) && (inches == null)) || ((feet == 0) && (inches == 0))) {
        return "N/A";
    }else {
        java.lang.String output = "";
        if (feet != null) {
            output += feet + "'";
        }
        if (inches != null) {
            output += inches + "\"";
        }
        return output;
    }
}