public static void addInputTokenAt(int i, java.lang.String keyId) {
    dcheungaa.procal.InputHandler.inputExpression.add(i, dcheungaa.procal.Tokens.inputTokensMap.get(keyId));
    java.lang.System.out.println(dcheungaa.procal.Tokens.inputTokensMap.get(keyId).display);
    dcheungaa.procal.InputHandler.updateMatrixDisplay();
}