private assignment2.Peg[] buildSecretCode(int length) {
    assignment2.Peg[] code = new assignment2.Peg[length];
    java.lang.String scode = assignment2.SecretCodeGenerator.getInstance().getNewSecretCode();
    for (int i = 0; i < length; i++) {
        code[i] = new assignment2.Peg(scode.charAt(i), i);
    }
    return code;
}