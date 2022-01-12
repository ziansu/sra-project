@java.lang.Override
public java.lang.String generate(java.lang.String input) {
    final int stopAt = java.lang.Math.abs((6 - (input.length())));
    java.lang.StringBuffer numberSequence = new java.lang.StringBuffer();
    for (int i = 1; i < stopAt; i++) {
        numberSequence.append(java.lang.String.valueOf(i));
    }
    final java.lang.String result = input + (numberSequence.toString());
    return org.apache.commons.lang3.StringUtils.rightPad(result, 12, result);
}