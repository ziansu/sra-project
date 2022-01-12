public static void addInputTokenAt(int i, java.lang.String keyId) {
    dcheungaa.procal.InputHandler.inputExpression.add(i, dcheungaa.procal.Tokens.inputTokensMap.get(keyId));
    dcheungaa.procal.InputHandler.updateMatrixDisplay();
}