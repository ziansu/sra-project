@java.lang.Override
public void print() {
    try {
        textArea.print(new java.text.MessageFormat(this.getTitle()), new java.text.MessageFormat("{0}"), true, null, null, true);
    } catch (java.awt.print.PrinterException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Couldn't print the document", "Printing error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}