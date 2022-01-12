void copyToClipboard(java.lang.String data) {
    java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(data);
    java.awt.datatransfer.Clipboard clpbrd = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
    clpbrd.setContents(stringSelection, null);
}