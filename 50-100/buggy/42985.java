private void setDefaultText() {
    java.lang.Runnable rnbl = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setEchoChar(((char) (0)));
            justFilled = true;
            defaultShown = true;
            setForeground(java.awt.Color.GRAY);
            setText(defaultText);
            setCaretPosition(0);
        }
    };
    javax.swing.SwingUtilities.invokeLater(rnbl);
}