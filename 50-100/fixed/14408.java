public void appendStatus(final java.lang.String status) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            java.lang.String text = getText();
            if ((text.length()) != 0) {
                text += java.lang.String.format("%n%s", status);
            }else {
                text += status;
            }
            setText(text);
        }
    });
    java.lang.System.out.println(status);
}