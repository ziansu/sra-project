private java.awt.event.ActionListener configuraDisplayListener() {
    java.awt.event.ActionListener displayListener = new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            getViewHome().setVisible(true);
        }
    };
    return displayListener;
}