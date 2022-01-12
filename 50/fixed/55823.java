static java.lang.String generateCode() {
    java.lang.Integer randomSixDigitCode = (new java.util.Random().nextInt(900000)) + 100000;
    return randomSixDigitCode.toString();
}