public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String s = t1.getText();
    int i = java.lang.Integer.parseInt(s);
    java.lang.String event = e.getActionCommand();
    if (event.equals("CtoF")) {
        t2.setText(java.lang.String.valueOf(TempConversionWindow.CtoF(i)));
    }
    if (event.equals("FtoC")) {
        t2.setText(java.lang.String.valueOf(TempConversionWindow.FtoC(i)));
    }
}