protected void expectException(java.lang.Class<? extends java.lang.Throwable> type, java.lang.String message) {
    thrown.expect(type);
    java.lang.String msg = java.lang.String.format(message);
    thrown.expectMessage(msg);
}