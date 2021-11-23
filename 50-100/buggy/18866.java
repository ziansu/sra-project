public static void appendNewLines(java.lang.String[] shaderCode) {
    for (int i = 0; i < (shaderCode.length); i++) {
        shaderCode[i] = new java.lang.String(((shaderCode[i]) + (java.lang.System.lineSeparator())));
    }
}