@java.lang.Override
public void print() {
    java.lang.System.out.println(textArea.getText());
    try {
        boolean complete = textArea.print(new java.text.MessageFormat(this.getTitle()), new java.text.MessageFormat("{0}"), true, null, null, true);
        if (complete) {
            java.lang.System.out.println("Printed the document.");
        }else {
            java.lang.System.out.println("Didn't print the document");
        }
    } catch (java.awt.print.PrinterException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Couldn't print the document", "Printing error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}