private void jTextField30MouseExited(java.awt.event.MouseEvent evt) {
    try {
        java.lang.Integer qty = java.lang.Integer.parseInt(jTextField29.getText());
        java.lang.Integer sample = java.lang.Integer.parseInt(jTextField30.getText());
        java.lang.Integer days = qty * sample;
        jTextField31.setText(days.toString());
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}