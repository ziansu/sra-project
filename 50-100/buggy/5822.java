public void resolvePositionAndShow(java.lang.String signature, int left, int top) {
    signature = truncateSignature(signature);
    if (signature != null)
        setText(signature);
    
    resolveWidth(signature);
    resolvePositionRelativeTo(left, top);
    setVisible(true);
    show();
}