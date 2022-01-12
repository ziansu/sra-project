public java.lang.String getMask() {
    java.lang.StringBuilder output = new java.lang.StringBuilder();
    int unmaskedIndexCounter = 0;
    for (int i = 0; i < (answer.length()); i++) {
        if (i == (unmaskedLetters[unmaskedIndexCounter])) {
            output.append(answer.charAt(unmaskedLetters[unmaskedIndexCounter]));
            unmaskedIndexCounter++;
        }else {
            output.append("_");
        }
    }
    return output.toString();
}