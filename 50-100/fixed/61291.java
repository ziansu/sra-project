private boolean loadString() {
    java.io.BufferedReader b = plproject3.FileManager.openFile(parent);
    if (b == null)
        return false;
    else {
        try {
            java.lang.String s = plproject3.FileManager.readNextLine(b);
            parent.setWordEntryString(s);
            this.setWord(s);
        } catch (java.lang.Exception e) {
            javax.swing.JOptionPane.showMessageDialog(parent, "Error Reading File", "File Read Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}