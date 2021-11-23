private javax.swing.JTextField createProblematicRangeField(java.lang.String text) {
    javax.swing.JTextField sumRange = new javax.swing.JTextField(text, 30);
    sumRange.setEditable(false);
    if ((parentFrame) instanceof com.kanji.window.BaseWindow) {
        com.kanji.window.BaseWindow b = ((com.kanji.window.BaseWindow) (parentFrame));
        sumRange.setText(((sumRange.getText()) + (b.getProblematicKanjis().size())));
    }
    return sumRange;
}