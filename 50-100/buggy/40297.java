private void prepare(final char c) {
    java.lang.Runnable rnbl = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setEchoChar(defaultEcho);
            justCleared = true;
            defaultShown = false;
            setForeground(defaultColor);
            setText(("" + c));
        }
    };
    javax.swing.SwingUtilities.invokeLater(rnbl);
}