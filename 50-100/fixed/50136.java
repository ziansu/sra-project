private synchronized void rewriteField(java.util.List<java.lang.String> newLines) {
    if ((newLines.size()) == 0) {
        logOutputField.setText("");
    }
    this.lines = new java.util.ArrayList<view.OutputArrayElement>();
    for (java.lang.String line : newLines) {
        java.lang.String out = "";
        out += time.get();
        out += ": ";
        out += line;
        out += '\n';
        lines.add(new view.OutputArrayElement(out));
        writeArrayToField();
    }
}