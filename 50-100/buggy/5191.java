public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (btn1)) {
        java.lang.String s1 = tf1.getText();
        java.lang.System.out.println(s1);
        setVisible(false);
        retrieved obj = new retrieved();
        obj.setVisible(true);
    }
}